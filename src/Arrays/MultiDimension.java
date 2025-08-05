package Arrays;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows for the Array: ");
        int rows = sc.nextInt();
        System.out.println("Enter columns for the Array: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.printf("Enter [%d][%d] matrix value: ", r, c);
                matrix[r][c] = sc.nextInt();
            }
        }
        sc.close();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.printf("Matrix: " + matrix[r][c]);
            }
            System.out.println();
        }
    }
}
