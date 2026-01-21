package AP_1;

import java.util.Arrays;
import java.util.Objects;

public class WordsWithout {
    /*
    Given an array of strings, return a new array without the strings that are equal to the target string. One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.


wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
     */

    public String[] wordsWithout(String[] words, String target) {
        int occurrences = Math.toIntExact(Arrays.stream(words).filter(word -> Objects.equals(word, target)).count());
        int resLength = words.length - occurrences;
        String[] res = new String[resLength];
        int index = 0;
        for (int i = 0; index < resLength; i++) {
            if (!words[i].equals(target)) {
                res[index] = words[i];
                index++;
            }
        }
        return res;
    }

}
