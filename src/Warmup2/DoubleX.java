package Warmup2;

public class DoubleX {
    /*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
     */

    boolean doubleX(String str) {
        int firstInstance = str.indexOf('x');
        if (firstInstance == -1) return false;

        if ((firstInstance + 1) >= str.length()) return false;

        return str.substring(firstInstance + 1, firstInstance + 2).equals("x");

    }

}
