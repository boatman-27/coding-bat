package Warmup1;

public class StringE {
    /*

Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
     */

    public boolean stringE(String str) {
        long numEs = str.chars().filter(ch -> ch == 'e').count();
        return numEs >= 1L && numEs <= 3L;

    }
}
