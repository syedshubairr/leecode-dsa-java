package FuncAndMethods;

public class ArmstrongNumber {
    /*
    A 3-digit number, in which all the three number cubes are added, they return the same original number, is ArmStrong Number.
     */
    public static void main(String[] args) {
        System.out.println("Showing Armstrong numbers till 1000");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        return original == sum;
    }
}
