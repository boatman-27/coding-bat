package String_3;

public class SumNumbers {
    /*
    Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)


sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
     */

    public int sumNumbers(String str) {
        int sum = 0;
        int i = 0;
        int begin;
        int end;

        while(i < str.length() && !Character.isDigit(str.charAt(i)))
            i++;

        begin = i;
        end = i;

        while(i < str.length()) {
            if(!Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.substring(begin, end));
                while(i < str.length() && !Character.isDigit(str.charAt(i)))
                    i++;

                begin = i;
                end = i;
            } else {
                end++;
                i++;
            }
        }

        if(end > begin)
            sum += Integer.parseInt(str.substring(begin, end));

        return sum;
    }

}
