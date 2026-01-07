package Warmup1;

public class Max1020 {
    /*

Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
     */

    public int max1020(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max >= 10 && max <= 20) {
            return max;
        }
        if (min >= 10 && min <= 20) {
            return min;
        }

        return 0;
    }
}
