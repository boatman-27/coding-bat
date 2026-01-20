package Array_2;

import java.util.Arrays;

public class More14 {
    /*
    Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
     */

    public boolean more14(int[] nums) {
        int countOnes = Math.toIntExact(Arrays.stream(nums).filter(n -> n == 1).count());
        int countFours = Math.toIntExact(Arrays.stream(nums).filter(n -> n == 4).count());

        return countFours < countOnes;

    }

}
