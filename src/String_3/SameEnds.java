package String_3;

public class SameEnds {
    /*
    Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".


sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
     */

    public String sameEnds(String string) {
        int left = string.length() / 2;
        int right = (int) Math.ceil((double) string.length() / 2);

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.substring(0, left).equals(string.substring(right))) {
                return string.substring(0, left);
            }
            left--;
            right++;
        }

        return "";
    }

}
