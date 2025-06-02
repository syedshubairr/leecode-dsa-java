package Searching;

public class EventDigits {
    public static void main(String[] args) {
        int[] nums = {18, 124, 9, -1764, 98, 1};
        System.out.println("Even number of digits are: " + findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int noOfDigits = 0;
        if (num < 0) {
            num = num * -1;
        }
        if (num >= 0 && num < 10) {
            return false;
        }
        while (num > 0) {
            noOfDigits++;
            num = num / 10;
        }
        return noOfDigits % 2 == 0;
    }
}
