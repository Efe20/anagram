package de.beyonnex;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class AppTest {

    /**
     * Min number of args exception msg.
     */
    private static final String MIN_ARGS = "Please enter exact two arguments!";

    /**
     * Throws exception with 0 args.
     */
    @Test
    public final void exceptionIsThrownOnEmptyArgs() {
        final Throwable thrown = Assertions.catchThrowable(
            () -> new AppAnagram().exec()
        );
        Assertions.assertThat(thrown).hasMessageContaining(
            this.MIN_ARGS
        );
    }

    /**
     * Throws exception with 1 args.
     */
    @Test
    public final void exceptionIsThrownOnOneArg() {
        final Throwable thrown = Assertions.catchThrowable(
            () -> new AppAnagram("test").exec()
        );
        Assertions.assertThat(thrown).hasMessageContaining(
            this.MIN_ARGS
        );
    }

    /**
     * Not throws exception with 2 args
     */
    @Test
    public final void hasRightCountOfArgs2() {
        final Throwable thrown = Assertions.catchThrowable(
                () -> new AppAnagram("test", "hello").exec()
        );
        Assertions.assertThat(thrown).isEqualTo(null);
    }

    /**
     * Throws exception with 3 args..
     */
    @Test
    public final void hasRightCountOfArgs3() {
        final Throwable thrown = Assertions.catchThrowable(
                () -> new AppAnagram("test", "hello", "world").exec()
        );
        Assertions.assertThat(thrown).hasMessageContaining(
                this.MIN_ARGS
        );
    }
}
