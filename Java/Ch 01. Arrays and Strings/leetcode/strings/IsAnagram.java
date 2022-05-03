package leetcode.strings;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {
        String word1 = "leetcode";
        String word2 = "leetocde";

        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        System.out.println(Arrays.equals(str1, str2));

    }


}
