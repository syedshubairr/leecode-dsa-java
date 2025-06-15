package BinarySearch;

import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
//        int[] arr = {10, 20, 30, 40, 70, 90, 120};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = in.nextInt();
        int res = getFloorNumber(arr, target);
        System.out.println("Result Index: " + res + " Result Number: " + arr[res]);
    }

    public static int getFloorNumber(int[] arr, int target) {
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
        return end;
    }
}
