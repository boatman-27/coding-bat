package String_2;

public class GetSandwitch {
    /*
    A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
     */

    public String getSandwich(String str) {
        if (str.length() <=  10) return "";
        int left = 0;
        int right = str.length() - 5;

        while (left <= right && !str.substring(left, left + 5).equals("bread")) {
            left++;
        }

        while (right >= left && !str.substring(right, right + 5).equals("bread")) {
            right--;
        }

        if (left >= right) {
            return "";
        }

        return str.substring(left + 5, right);
    }

}
