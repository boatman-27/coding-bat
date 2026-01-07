package Warmup2;

public class StringSplosion {
    /*

Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
     */

    public String stringSplosion(String str) {
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            res = res + str.substring(0, i + 1);
        }

        return res;
    }

}
