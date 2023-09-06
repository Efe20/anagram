package de.beyonnex;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class AppAnagramTest {


    private static final String MIN_ARGS = "Please enter exact two arguments!";


    @Test
    public final void exceptionIsThrownOnEmptyArgs() {
        // GIVEN/WHEN
        final Throwable thrown = Assertions.catchThrowable(
            () -> new AppAnagram().exec()
        );

        // THEN
        Assertions.assertThat(thrown).hasMessageContaining(
            this.MIN_ARGS
        );
    }


    @Test
    public final void exceptionIsThrownOnOneArg() {
        // GIVEN/WHEN
        final Throwable thrown = Assertions.catchThrowable(
            () -> new AppAnagram("test").exec()
        );

        // THEN
        Assertions.assertThat(thrown).hasMessageContaining(
            this.MIN_ARGS
        );
    }


    @Test
    public final void exceptionIsNotThrownOnTwoArgs() {
        // GiVEN/WHEN
        final Throwable thrown = Assertions.catchThrowable(
                () -> new AppAnagram("test", "hello").exec()
        );

        // THEN
        Assertions.assertThat(thrown).isEqualTo(null);
    }

    @Test
    public final void exceptionIsThrownOnThreeArgs() {
        // GIVEN/WHEN
        final Throwable thrown = Assertions.catchThrowable(
                () -> new AppAnagram("test", "hello", "world").exec()
        );

        // THEN
        Assertions.assertThat(thrown).hasMessageContaining(
                this.MIN_ARGS
        );
    }
}
