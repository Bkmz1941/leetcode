package tasks;

import java.util.StringTokenizer;

public class LengthLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        String[] strings = s.trim().split(" ");
        return strings[strings.length - 1].length();
    }
}
