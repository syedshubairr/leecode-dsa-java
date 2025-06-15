package BinarySearch;

import java.util.Scanner;

public class CeilingNumber {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int[] arr = {10, 20, 30, 40, 70, 90, 120};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = in.nextInt();
        int res = getCeilingNumber(arr, target);
        System.out.println("Result: " + res);
        res = improvedGetCeilingNumber(arr, target);
        System.out.println("Result Improved: " + res);
    }

    public static int getCeilingNumber(int[] arr, int target) {
        if (arr.length < 1) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int diff = Integer.MAX_VALUE;
        int index = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
                if (diff > target - arr[mid]) {
                    diff = target - arr[mid];
                    index = mid;
                }
            } else if (target < arr[mid]) {
                end = mid - 1;
                if (diff > arr[mid] - target) {
                    diff = arr[mid] - target;
                    index = mid;
                }
            } else {
                index = mid;
            }
        }
        return index;
    }

    public static int improvedGetCeilingNumber(int[] arr, int target) {
        if (arr.length < 1) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
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
        return start;
    }
}
