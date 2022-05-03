package leetcode.strings;

import java.util.concurrent.TimeUnit;

public class IsPalindrome {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        long startTimeV1 = System.nanoTime();

        str = str.replaceAll("[^A-Za-z]", "").toLowerCase();

        boolean result = isPalindrome(str);

        displayExecutionTime(System.nanoTime() - startTimeV1);

        System.out.println("'" + str + "' is palindrome? " + result);
    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time: " + time + " ns" + " ("
                + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms)");
    }
}
