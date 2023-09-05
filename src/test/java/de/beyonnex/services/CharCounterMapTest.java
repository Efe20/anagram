package de.beyonnex.services;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Map;

public class CharCounterMapTest {

    /**
     * Returns char map with correct count uppercase.
     */
    @Test
    public final void shouldReturnCharUppercaseMapWithCorrectCount() {
        // GIVEN/WHEN
        final Map map = new CharCounterMap(new char[]{'T', 'E', 'E', 'S', 'T'}).map();

        // THEN
        Assertions.assertThat(map.get('T')).isEqualTo(2);
        Assertions.assertThat(map.get('E')).isEqualTo(2);
        Assertions.assertThat(map.get('S')).isEqualTo(1);
        Assertions.assertThat(map.get('A')).isEqualTo(null);
    }
}
