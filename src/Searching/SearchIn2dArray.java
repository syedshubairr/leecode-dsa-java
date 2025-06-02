package Searching;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 5, 79},
                {13, 9, 20},
                {59, 17, 36},
                {22, 66, 88}
        };
        int target = 66;
        System.out.println(target + " is present? " + search(arr, target));
        System.out.println(target + " index is: " + Arrays.toString(getRowAndColumn(arr, target)));
    }

    public static boolean search(int[][] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] getRowAndColumn(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
