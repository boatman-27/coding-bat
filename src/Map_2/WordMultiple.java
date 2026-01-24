package Map_2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    /*
    Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}

     */

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> count = new HashMap<>();
        Map<String, Boolean> res = new HashMap<>();

        for (String s : strings) {
            count.put(s, count.getOrDefault(s, 0) + 1);
        }
        for (String s : strings) {
            res.put(s, count.getOrDefault(s, 0) >= 2);
        }
        return res;
    }

}
