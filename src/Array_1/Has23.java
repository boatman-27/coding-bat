package Array_1;

import java.util.Arrays;

public class Has23 {
    /*
    Given an int array length 2, return true if it contains a 2 or a 3.


has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false

     */

    public boolean has23(int[] nums) {
       return Arrays.stream(nums).anyMatch(n -> n == 2 || n == 3);
    }

}
