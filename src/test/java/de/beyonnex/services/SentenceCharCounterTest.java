package de.beyonnex.services;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Map;

public class SentenceCharCounterTest {

    /**
     * Returns char map with correct count uppercase.
     */
    @Test
    public final void shouldReturnCharUppercaseMapWithCorrectCount() {
        final Map map = new SentenceCharCounter("TEstteSt").uppercaseMap();
        Assertions.assertThat(map.get('T')).isEqualTo(4);
        Assertions.assertThat(map.get('E')).isEqualTo(2);
        Assertions.assertThat(map.get('S')).isEqualTo(2);
    }
}
