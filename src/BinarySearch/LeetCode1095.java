package BinarySearch;

public class LeetCode1095 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int[] arr = {3, 5, 3, 2, 0};
        int target = 5;
        System.out.println("Ans: " + findInMountainArray(target, arr));
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int ans = findElement(target, mountainArr, true);
        if (ans == -1) {
            return findElement(target, mountainArr, false);
        }
        return ans;
    }

    public static int findElement(int target, int[] a, boolean inStart) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < a[mid]) {
                end = mid - 1;
            } else {
                if (inStart) {
                    end = mid - 1;
                } else {
                    start = mid;
                }
            }
        }
        return -1;
    }
}
