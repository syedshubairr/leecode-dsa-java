package IntegerDSA;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any number: ");
        num = input.nextInt();
        System.out.println(num + " is Palindrom: " + isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        if (x > 9 && x < 100 || x < 0) {
            return false;
        }
        int n = x;
        int rem = 0;
        while (n > 0) {
            int d = n % 10;
            rem = rem * 10 + d;
            n = n / 10;
        }
        if (rem == x) {
            return true;
        }
        return false;
    }
}
