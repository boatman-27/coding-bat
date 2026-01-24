package Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    /*
    Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.


wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"


     */

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String res = "";
        for (String str : strings) {
            map.put(str, map.getOrDefault(str, 0) + 1);
            if (map.get(str) % 2 == 0) {
                res += str;
            }
        }
        return res;


    }

}
