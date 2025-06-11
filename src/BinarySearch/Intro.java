package BinarySearch;

public class Intro {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        int result = searchElement(arr, 9);
        if (result >= 0) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    public static int searchElement(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            System.out.println("Loop running" + start + ":" + end + ":" + mid);
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
