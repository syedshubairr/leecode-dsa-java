package Loops;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10;
            reverse += num % 10;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
