package BinarySearch;

public class ImprovedOrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {78, 72, 65, 55, 12, 10, 8, 5, 2, 1}; // descending array
//        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9}; // ascending array
        int target = 65;
        boolean isAsc = arr[0] <= arr[arr.length - 1];
        int result = agnosticSearch(arr, target, isAsc);
        System.out.println("The index of the target " + target + " is " + result);
    }

    public static int agnosticSearch(int[] arr, int target, boolean isAsc) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
