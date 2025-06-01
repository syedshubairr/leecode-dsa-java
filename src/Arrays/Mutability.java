package Arrays;

import java.util.Arrays;

public class Mutability {
    public static void main(String[] args) {
//        Arrays are mutable, unlike Strings.
//        If we pass an array into another function and changed something in the array in that function,
//        the real object of the array also gets changed.
        String[] arr = {"aa", "bb", "cc", "dd"};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void change(String[] nums) {
        nums[0] = "55";
    }
}
