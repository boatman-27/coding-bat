package String_3;

public class EqualIsNot {
    /*
    Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).


equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
     */

    public static void main(String[] args) {
        EqualIsNot e = new EqualIsNot();
        e.equalIsNot("This is notnot");
    }

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        String is = "is";
        String not = "not";

        for (int i = 0; i <= str.length() - is.length(); i++) {
            if (str.substring(i, i + is.length()).equals(is)) {
                countIs++;
            }
        }

        for (int i = 0; i <= str.length() - not.length(); i++) {
            if (str.substring(i, i + not.length()).equals(not)) {
                countNot++;
            }
        }

        System.out.println(countIs + " " + countNot);


        return countIs == countNot;
    }

}
