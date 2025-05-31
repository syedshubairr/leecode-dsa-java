package Loops;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = in.nextInt();
        System.out.println("Enter your digit to count: ");
        int numTocCount = in.nextInt();
        int count = 0;
        while (num > 0) {
            if (num % 10 == numTocCount) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
