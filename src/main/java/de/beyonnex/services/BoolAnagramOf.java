/**
  * This lass represents a helper class used to check if two strings
  * (in the form of maps of characters and their frequencies) are anagrams of each other.
  */
package de.beyonnex.services;

import java.util.Map;

public final class BoolAnagramOf {

    private final Map<Character, Integer> firstSentence;

    private final Map<Character, Integer> secondSentence;

    public BoolAnagramOf(final Map<Character, Integer> firstSentence,
                         final Map<Character, Integer> secondSentence) {
        this.firstSentence = firstSentence;
        this.secondSentence = secondSentence;
    }

    /**
     * Check if texts are anagram.
     **/
    public boolean areAnagram() {
        boolean res = true;

        if (this.firstSentence.size() == this.secondSentence.size()) {
            for (final char key : this.firstSentence.keySet()) {
                if (!this.firstSentence.get(key).equals(this.secondSentence.get(key))) {
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }
        return res;
    }

}
