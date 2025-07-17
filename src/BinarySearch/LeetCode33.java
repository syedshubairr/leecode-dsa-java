package BinarySearch;

public class LeetCode33 {
    public static void main(String[] args) {
//        int[] nums = {4, 5, 6, 7, 8, 1, 2};
//        int[] nums = {0};
        int[] nums = {4, 5, 6, 0, 1, 2, 3};
//        int[] nums = {5, 1, 3};
        int target = 10;
        int pivot = findPivot(nums);
        System.out.println("The pivot is: "+nums[pivot]);
        int ans = findElement(nums, target, 0, pivot);
        if (ans == -1) {
            ans = findElement(nums, target, pivot + 1, nums.length - 1);
        }
        System.out.println("The 1st approach gives: " + ans);
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            } else {
                if (nums[mid] > nums[start]) {
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
