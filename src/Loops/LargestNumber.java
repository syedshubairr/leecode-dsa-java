package Loops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = 0;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
        // Another approach.
        max = 0;
        max = a;
        if (max <= b) {
            max = b;
        }
        if (max <= c) {
            max = c;
        }
        System.out.println(max);
    }
}
