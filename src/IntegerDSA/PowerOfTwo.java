package IntegerDSA;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any number: ");
        num = input.nextInt();
        System.out.println(num + " is PowerOfTwo: " + isPowerOfTwo(num));
    }
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
