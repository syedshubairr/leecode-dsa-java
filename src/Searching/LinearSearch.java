package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 56, 8, 79, 64, 23, 68};
        System.out.println("The array is: " + Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to find in the array: ");
        int toFind = in.nextInt();
        int index = searchNumber(arr, toFind);
        if (index < 0) {
            System.out.println("Element doesn't exist in the array");
        } else {
            System.out.println("The element " + toFind + " is on index " + index);
        }
    }

    public static int searchNumber(int[] arr, int toFind) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
}
