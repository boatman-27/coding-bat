package String_1;

public class WithoutX2 {
    /*
    Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
     */

    public String withoutX2(String str) {
        if (str == null || str.isEmpty()) return "";

        if (str.length() == 1) {
            return str.equals("x") ? "" : str;
        }

        String first = str.charAt(0) == 'x' ? "" : String.valueOf(str.charAt(0));
        String second = str.charAt(1) == 'x' ? "" :  String.valueOf(str.charAt(1));

        return first + second + str.substring(2);
    }

}
