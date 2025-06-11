package BinarySearch;

public class Intro {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9};
        int[] arr2 = {78, 72, 65, 55, 12, 10, 8, 5, 2, 1};
        System.out.println("For ascending array.");
        int result = searchElement(arr, 9);
        if (result >= 0) {
            System.out.println("Found in ascending");
        } else {
            System.out.println("Not Found in ascending");
        }
        System.out.println("For descending array.");
        result = searchElementDesc(arr2, 65);
        if (result >= 0) {
            System.out.println("Found in descending");
        } else {
            System.out.println("Not Found in descending");
        }
    }

    public static int searchElementDesc(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int searchElement(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
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
