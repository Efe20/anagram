/**
  * This class is a helper class used to count the number of occurrences of characters 
  * in a character array and return a map of characters to their frequencies.
**/
package de.beyonnex.services;

import java.util.HashMap;
import java.util.Map;

public final class CharCounterMap {

    private final char[] chars;

    public CharCounterMap(final char[] chars) {
        this.chars = chars;
    }

    /**
     * Get char count map.
     *
     */
    public Map<Character, Integer> map() {
        final Map<Character, Integer> map = new HashMap<>();
        for (final char chr : this.chars) {
            if (map.containsKey(chr)) {
                map.put(chr, map.get(chr) + 1);
            } else {
                map.put(chr, 1);
            }
        }
        return new HashMap<>(map);
    }

}
