package BinarySearch;

public class LeetCode852 {
    public static void main(String[] args) {
//        also known as bi-tonic array. first increasing then decreasing.
        int[] arr = {0, 2, 1, 0};
//        int[] arr = {0, 7, 10, 5, 4, 3, 2};
        // peek also means that find the largest in the array,
        // assume the array as a mountain and the peek will be its highest points.
        System.out.println("Enter of peek:" + peekMountain(arr));
        System.out.println("Enter of peek:" + arr[peekMountain(arr)]);
    }

    public static int peekMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // we are in the decreasing part of the array.
                // we may have found the answer, but we are not sure if that the correct answer.
                end = mid;
            } else {
                // we are in the increasing part of the array.
                // we know that mid > mid + 1, so thats why we are incrementing the array but one.
                start = mid + 1;
            }
        }
        // returning start, as our start element will be on the peek.
        return start;
    }
}
