package leetcode.strings;

public class StrNeedle {

    public static void main(String[] args) {
        String haystack = "hlello";
        String needle = "ll";

        System.out.println("The index of the first occurrence of needle in haystack is "
                + strstr(haystack, needle));
    }

    public static int strstr(String haystack, String needle)
    {
        // if `haystack` is null or if haystack's length is less than that of needle's
        if (haystack == null || needle.length() > haystack.length()) {
            return -1;
        }

        // if `needle` is null or is empty
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++ ) {
            int j;

            for (j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) != haystack.charAt(i+j)) {
                    break;
                }
            }
            if (needle.length() == j) {
                return i;
            }

        }

        return -1;
    }
}
