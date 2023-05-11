package tasks;

public class FindIndexFirstOccurrenceInString {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "leeto"));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
