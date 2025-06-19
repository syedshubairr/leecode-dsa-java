package BinarySearch;

public class LeetCode1095 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int[] arr = {3, 5, 3, 2, 0};
        int target = 5;
        int peek = peekMountain(arr);
        int ans = findElement(target, arr, 0, peek);
        if (ans == -1) {
            ans = findElement(target, arr, peek + 1, arr.length - 1);
        }
        System.out.println("Found" + ans);
    }

    public static int peekMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in the decreasing part of the array.
                // we may have found the answer, but we are not sure if that the correct answer.
                end = mid;
            } else {
                // we are in the increasing part of the array.
                // we know that mid > mid + 1, so thats why we are incrementing the array but one.
                start = mid + 1;
            }
        }
        // returning start, as our start element will be on the peek.
        return start;
    }

    public static int findElement(int target, int[] a, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = start + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
