package BinarySearch;

public class LeetCode33DuplicateValues {
    public static void main(String[] args) {
//        int[] nums = {2, 3, 4, 2, 2, 2};
//        int[] nums = {1, 1, 2, 1, 1, 1};
//        int[] nums = {4, 4, 5, 6, 6, 1, 2, 4};
        int[] nums = {5, 5, 6, 1, 2, 2, 3, 4};
        int target = 0;
        int pivot = findPivot(nums);
        System.out.println("The pivot is " + nums[pivot] + " at index " + pivot);
        int ans = findElement(nums, target, 0, pivot);
        if (ans == -1) {
            ans = findElement(nums, target, pivot + 1, nums.length - 1);
        }
        System.out.println("Index is " + ans + " of target " + target);
    }


    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            } else {
                if (nums[mid] == nums[start] && nums[start] == nums[end]) {
                    start++;
                    end--;
                } else if (nums[mid] >= nums[start]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        return start;
    }

    public static int findElement(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
