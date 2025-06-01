package Arrays;

public class Intro {
    public static void main(String[] args) {
//        To store roll numbers up to 6.
//        int[] rnos = new int[6];
//        1. The same datatype across the array entities.
//        int[] rnos2 = {1, 2, 3, 4, 5};
        int[] rno; // Its just initialization, so it doesnt create a its memory in heap. (compile time)
        rno = new int[5]; // here the new array is created and stored in heap memory. (run-time)
        System.out.println(rno[1]); // by default all the values in this (int) array will be zero. output: 0
        String[] str;
        str = new String[5]; // in this (String) array by deafult all the values will be null.
        System.out.println(str[2]); // output: null

    }
}
