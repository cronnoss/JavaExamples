package leetcode.strings;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class IsPalindrome {

    public static void main(String[] args) {
       String word1 = "A man, a plan, a canal: Panama";

        word1 = word1.replaceAll("[^A-Za-z]", "").toLowerCase();
        int right = 0;
        int left = word1.length()-1;

        while (left>right) {
            char leftChar = word1.charAt(left++);
            char rightChar = word1.charAt(right--);
            if (leftChar != rightChar);
        }

    }


}
