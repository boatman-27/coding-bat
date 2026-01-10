package String_1;

public class WithoutX {
    /*
    Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
     */

    public String withoutX(String str) {
        if (str == null || str.isEmpty()) return "";

        if (str.length() == 1) {
            return str.equals("x") ? "" : str;
        }

        String first = str.charAt(0) == 'x' ? "" : String.valueOf(str.charAt(0));
        String last = str.charAt(str.length() - 1) == 'x' ? "" : String.valueOf(str.charAt(str.length() - 1));

        String middle = str.substring(1, str.length() - 1);

        return first + middle + last;
    }

}
