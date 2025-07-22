package BinarySearch;

public class FindRotationInRotatedBS {
    public static void main(String[] args) {
//        int[] nums = {2, 3, 4, 2, 2, 2};
//        int[] nums = {1, 1, 2, 1, 1, 1};
//        int[] nums = {4, 4, 5, 6, 6, 1, 2, 4};
//        int[] nums = {5, 5, 6, 1, 2, 2, 3, 4};
        int[] nums = {6, 7, 8, 1, 2, 3, 4, 5};
//        int rotations = findRotationWithDuplicates(nums);
        int rotations = findRotation(nums);
        if (rotations == nums.length - 1) {
            System.out.println("Array not Rotated");
        } else {
            System.out.println("Array rotated " + (rotations + 1) + " times");
        }
    }

    public static int findRotationWithDuplicates(int[] nums) {
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

    public static int findRotation(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            } else {
                if (nums[mid] >= nums[start]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        return start;
    }
}
