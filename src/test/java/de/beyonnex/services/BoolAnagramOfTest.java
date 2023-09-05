package de.beyonnex.services;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BoolAnagramOfTest {


    @Test
    public final void shouldReturnTextsAreAnagramHaveSameKeys() {
        // GIVEN
        String testSentenceFirst = "LISTEN";
        String testSentenceSecond = "SILENT";

        // WHEN
        boolean result =  new BoolAnagramOf(
                new SentenceCharCounter(testSentenceFirst).uppercaseMap(),
                new SentenceCharCounter(testSentenceSecond).uppercaseMap()
        ).areAnagram();

        // THEN
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public final void shouldReturnTextsAreNotAnagramHaveNotEqualSize() {
        // GIVEN
        String testSentenceFirst = "LISTEN";
        String testSentenceSecond = "SILENTT";

        // WHEN
        boolean result =  new BoolAnagramOf(
                new SentenceCharCounter(testSentenceFirst).uppercaseMap(),
                new SentenceCharCounter(testSentenceSecond).uppercaseMap()
        ).areAnagram();

        // THEN
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public final void shouldReturnTextsAreNotAnagramHaveNotSameKeys() {
        // GIVEN
        String testSentenceFirst = "LISTEN";
        String testSentenceSecond = "SILEN";

        // WHEN
        boolean result =  new BoolAnagramOf(
                new SentenceCharCounter(testSentenceFirst).uppercaseMap(),
                new SentenceCharCounter(testSentenceSecond).uppercaseMap()
        ).areAnagram();

        // THEN
        Assertions.assertThat(result).isFalse();
    }
}
