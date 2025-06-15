package BinarySearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class LeetCodeProblem744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'g'};
        char target = 'c';
        char res = smallestLetterGreaterThanTarget(letters, target);
        System.out.println("Found: " + res);
    }

    public static char smallestLetterGreaterThanTarget(char[] let, char target) {
        if (target >= let[let.length - 1]) {
            return let[0];
        }
        int start = 0;
        int end = let.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < let[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return let[start % let.length];
    }
}
