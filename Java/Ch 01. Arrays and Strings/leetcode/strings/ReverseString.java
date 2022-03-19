package leetcode.strings;

public class ReverseString {

    public static void main(String[] args) {
        String str = "someString";
        char[] s = str.toCharArray();

        int left = 0, right = s.length - 1;

        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }

        System.out.println(s);
    }

}
