package BinarySearch;

import java.util.Arrays;

public class LeetCodeProblem34 {
    public static void main(String[] args) {
//        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println("Found: " + Arrays.toString(searchRange(arr, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = searchIndex(nums, target, true);
        if (ans[0] == -1) {
            return ans;
        }
        ans[1] = searchIndex(nums, target, false);
        return ans;
    }

    public static int searchIndex(int[] nums, int target, boolean isStart) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (isStart) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
