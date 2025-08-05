package BinarySearch;

import java.util.Arrays;

public class BS2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 37;
        int[] found = findIn2d(arr, target);
        if (found == null) {
            System.out.println("Not Found");
            return;
        }
        System.out.println("Found at: " + Arrays.toString(found));
    }

    public static int[] findIn2d(int[][] arr, int target) {
        int row = 0;
        int column = arr[0].length - 1;
        while (row < arr[0].length - 1 && column > 0) {
            if (target == arr[row][column]) {
                System.out.println("The Element is found");
                return new int[]{row, column};
            } else if (target > arr[row][column]) {
                row++;
            } else if (target < arr[row][column]) {
                column--;
            }
        }
        return null;
    }
}
