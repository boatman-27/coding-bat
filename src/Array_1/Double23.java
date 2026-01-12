package Array_1;

public class Double23 {
    /*
    Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.


double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
     */

    public boolean double23(int[] nums) {
        int count2 = 0, count3 = 0;
        for (int n: nums) {
            if (n == 2) count2++;
            if (n == 3) count3++;
        }

        return count2 == 2 || count3 == 2;
    }

}
