package de.beyonnex.services;

import java.util.Map;

public final class SentenceCharCounter {

    private final String sentence;

    /**
     * Sentence to create count map
     */
    public SentenceCharCounter(final String sentence) {
        this.sentence = sentence;
    }


    /**
     * Map with uppercase char count.
     */
    public Map<Character, Integer> uppercaseMap() {
        return new CharCounterMap(
            this.sentence.toUpperCase().toCharArray()
        ).map();
    }
}
