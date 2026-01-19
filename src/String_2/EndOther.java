package String_2;

public class EndOther {
    /*
    Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true

     */

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        int minLength =  Math.min(a.length(), b.length());

        String aEnd = a.substring(a.length() - minLength);
        String bEnd = b.substring(b.length() - minLength);

        return  aEnd.equals(bEnd);
    }

}
