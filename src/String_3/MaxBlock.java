package String_3;

public class MaxBlock {
    /*
    Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.


maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
     */

    public int maxBlock(String str) {
        if (str.isEmpty()) return 0;
        int block = 1;
        int max = 1;

        for (int i = 1; i < str.length(); i++) {
            if  (str.charAt(i) == str.charAt(i - 1)) {
                block++;
                max = Math.max(block, max);
            }
            else {
                block = 1;
            }
        }

        return max;
    }

}
