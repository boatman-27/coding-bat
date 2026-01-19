package Logic_2;

public class CloseFar {
    /*
    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
     */

    public boolean closeFar(int a, int b, int c) {
        boolean bClose = Math.abs(a - b) <= 1;
        boolean cClose = Math.abs(a - c) <= 1;

        boolean bFar = Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2;
        boolean cFar = Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2;

        return (bClose && cFar) || (cClose && bFar);
    }

}
