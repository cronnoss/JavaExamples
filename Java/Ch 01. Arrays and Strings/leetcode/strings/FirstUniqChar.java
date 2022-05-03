package leetcode.strings;

public class FirstUniqChar {

    public static void main(String[] args) {
       String word = "loveleetcode";

       int first = firstUniqChar(word);

        System.out.println(word.charAt(first));
    }

    public static int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }

        return -1;
    }
}
