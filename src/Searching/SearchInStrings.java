package Searching;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "ShubairRaza";
        System.out.println("The String is: " + name);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character you want to search: ");
        char toFind = in.next().charAt(0);
        if (searchString(name, toFind)) {
            System.out.println(toFind + " is in the String");
        } else {
            System.out.println(toFind + " is not in the String");
        }
    }

    public static boolean searchString(String target, char toFind) {
        if (target.isEmpty()) {
            return false;
        }
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == toFind) {
                return true;
            }
        }
        return false;
    }
}
