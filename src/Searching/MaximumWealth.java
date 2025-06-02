package Searching;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println("Max Wealth is: " + maximumWealth(accounts));
        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println("Max Wealth is: " + maximumWealth(accounts2));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
