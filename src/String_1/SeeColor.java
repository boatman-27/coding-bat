package String_1;

public class SeeColor {
    /*
    Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
     */

    public String seeColor(String str) {
        if (str.length() < 3) return "";

        return str.startsWith("red") ? "red" :
                str.startsWith("blue") ? "blue" : "";
    }

}
