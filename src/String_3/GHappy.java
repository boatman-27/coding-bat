package String_3;

public class GHappy {
    /*
    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
     */

    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {

                boolean hasLeftG = (i > 0 && str.charAt(i - 1) == 'g');
                boolean hasRightG = (i < str.length() - 1 && str.charAt(i + 1) == 'g');

                if (!hasLeftG && !hasRightG) {
                    return false;
                }
            }
        }
        return true;
    }

}
