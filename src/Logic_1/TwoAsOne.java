package Logic_1;

public class TwoAsOne {
    /*
    Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
     */

    public boolean twoAsOne(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        return ab == c
                || bc == a
                || ac == b;
    }

}
