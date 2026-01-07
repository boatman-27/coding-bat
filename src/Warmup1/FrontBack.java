package Warmup1;

public class FrontBack {
    /*
    Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */

    public String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() - 1);

        return lastLetter + str.substring(1, str.length() - 1) + firstLetter;

    }
}
