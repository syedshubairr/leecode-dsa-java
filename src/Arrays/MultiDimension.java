package Arrays;

import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        arr[0] = new int[]{1, 2};
        arr[1] = new int[]{3, 4};
        System.out.println(Arrays.toString(arr[0]));

        int[][] arr2 = {
                {1, 2, 4},
                {2, 3},
                {3, 4, 9, 6, 7}
        };
    }
}
