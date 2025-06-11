package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {78, 72, 65, 55, 12, 10, 8, 5, 2, 1}; // descending array
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9}; // ascending array
        int target = 8;
        int result = agnosticSearch(arr, target);
        System.out.println("The index of the target " + target + " is " + result);
    }

    // Take any two elements and compare, we will know that if the start element is less
    // then the next one, its ASCENDING order, if not then it is in DESCENDING order
    public static int agnosticSearch(int[] arr, int target) {
        if (arr[0] < arr[arr.length - 1]) {
            return ascendingSearch(arr, target);
        }
        return descendingSearch(arr, target);
    }

    public static int ascendingSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int descendingSearch(int[] arr, int target) {
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
}
