package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(122);
        list.add(112);
        list.add(132);
        list.add(125);
        System.out.println("List: " + list);
        System.out.println("does list contains 123? " + list.contains(123));
        list.set(0, 88);
        System.out.println("List: " + list);
        multiAL();
    }

    static void multiAL() {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
