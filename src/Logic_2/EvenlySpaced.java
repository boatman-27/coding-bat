package Logic_2;

public class EvenlySpaced {
    /*
    Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
     */

    public boolean evenlySpaced(int a, int b, int c) {
        int sum = a + b + c;
       int small = Math.min(a, Math.min(b, c));
       int big = Math.max(a, Math.max(b, c));
       int middle = sum - (big + small);

       return Math.abs(middle - small) == Math.abs(middle - big);

    }

}
