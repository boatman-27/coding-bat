package String_1;

public class DeFront {
    /*
    Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
     */

    public String deFront(String str) {
        if (str.length() < 2) return str;
        String first = str.charAt(0) == 'a' ? "a" : "";
        String second = str.charAt(1) == 'b' ? "b" : "";

        return first + second + str.substring(2);


    }

}
