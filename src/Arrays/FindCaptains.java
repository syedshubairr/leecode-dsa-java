package Arrays;

import java.util.Stack;

/*

Given an array of size n, the task is to find all the Captains in the array.
An element is a Captain if it is greater than or equal to all the elements to its right side.
a = [5,4,7,2,6,1]
 */
public class FindCaptains {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 2, 6, 1};
        System.out.println(findCaptains(arr, arr.length - 1, 0));
    }

    public static Stack<Integer> findCaptains(int[] arr, int start, int end) {
        Stack<Integer> captains = new Stack<>();
        captains.add(arr[start]); // as the last one will always be the captain,
        // because the it will be greater then the elements on its right.
        for (int i = start - 1; i > end; i--) {
            if (arr[i] > captains.peek()) {
                captains.add(arr[i]);
            }
        }
        return captains;
    }
}
