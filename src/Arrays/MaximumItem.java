package Arrays;

import java.util.Arrays;

public class MaximumItem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 31, 4, 5};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Max Item of Array: " + max(arr));
        System.out.println("Reversing an array: ");
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void reverseArray(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
