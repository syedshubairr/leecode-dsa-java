package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 12, 18, 32, 52, 78, 99, 101};
        int target = 99;
        System.out.println("Found: " + arr[ans(arr, target)]);
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the search range until target is less than or equal to arr[end]
        // or we hit an out-of-bounds condition
        while (true) {
            try {
                if (target <= arr[end]) {
                    break; // Target is within the current range
                }
                int newStart = end + 1;
                end = end + (end - start + 1) * 2; // Exponential expansion
                start = newStart;
            } catch (ArrayIndexOutOfBoundsException e) {
                // If end is out of bounds, use the last valid end
                end = start + (end - start) / 2; // Adjust end to a safe value
                break;
            }
        }

        return binarySearch(arr, start, end, target);
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
