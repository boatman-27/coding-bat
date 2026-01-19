package String_2;

public class MixString {
    /*
    Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
     */

    public String mixString(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        String res = "";
        for (int i = 0; i < minLen; i++) {
            res += a.charAt(i);
            res += b.charAt(i);
        }

        for (int i = minLen; i < a.length(); i++) {
            res += a.charAt(i);
        }

        for (int i = minLen; i < b.length(); i++) {
            res += b.charAt(i);
        }

        return res;
    }

}
