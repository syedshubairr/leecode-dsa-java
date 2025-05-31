package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Fib-limit: ");
        int limit = input.nextInt();
        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.println(a + " " + b);
        for (int i = 0; i < limit; i++) {
            temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
        System.out.println("\n" + temp);
    }
}
