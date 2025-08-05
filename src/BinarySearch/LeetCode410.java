package BinarySearch;

public class LeetCode410 {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println("The ans is: " + splitArray(nums, m));
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // This will give the larget sum in array, assuming our m = 1
            end += nums[i]; // This will give the total sum in array, assuming our m = array.length
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0; // the sum of the array we will sum of the pieces
            int pieces = 1; // the lowest number of pieces to calculate, then we increment it as we create new pieces.
            for (int num : nums) {
                if (num + sum > mid) {
                    sum = num; // if the sum > mid, then we will create a new array, and increase the pieces(sub-array)
                    pieces++; // as the sum > mid, then the nums[i] will be the new sum inorder to create a new sub-array.
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // as your loop will break when start = end, so we can return whatever.
    }
}
