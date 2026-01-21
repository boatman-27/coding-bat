package AP_1;

public class CommonTwo {
    /*
    Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.


commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3
     */

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        int IndexA = 0;
        int IndexB = 0;

        while (IndexA < a.length && IndexB < b.length) {
            int compareResult = a[IndexA].compareTo(b[IndexB]);
            if (compareResult == 0) {
                count++;
                String val = a[IndexA];

                while(IndexA < a.length && a[IndexA].equals(val)) IndexA++;
                while (IndexB < b.length && b[IndexB].equals(val)) IndexB++;
            }
            else if (compareResult > 0) {
                IndexB++;
            } else  {
                IndexA++;
            }
        }
        return count;
    }

}
