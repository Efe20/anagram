package de.beyonnex.errorhandling;

import java.io.IOException;

public class CountOfArgsNotAllowedException extends IOException {
    public CountOfArgsNotAllowedException(final String message) {
        super(message);
    }
}
