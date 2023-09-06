package de.beyonnex;

import de.beyonnex.errorhandling.CountOfArgsNotAllowedException;
import de.beyonnex.services.AnagramCheckerService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public final class AppAnagram {

    private final transient Iterable<String> arguments;

    /**
     * Command line args
     */
    public AppAnagram(final String... args) {
        this.arguments = Arrays.asList(args);
    }

    /**
     * Main method
     *
     * @param args Arguments
     */
    public static void main(final String[] args) throws IOException {
        new AppAnagram(args).exec();
    }

    /**
     * Run app
     * @throws IOException If args are less or greater than 2
     */
    @SuppressWarnings("PMD.SystemPrintln")
    public void exec() throws IOException {
        final List<String> sentences = new ArrayList((Collection) this.arguments);
        if (sentences.size() < 2  || sentences.size() >= 3) {
            throw new CountOfArgsNotAllowedException("Please enter exact two arguments!");
        }
        final AnagramCheckerService anagramCheckerService = new AnagramCheckerService(
                sentences.get(0),
                sentences.get(1));
        if (anagramCheckerService.textsAreAnagram()) {
            System.out.println("The two texts are anagrams = TRUE");
        } else {
            System.out.println("The two texts are anagrams = FALSE");
        }
    }

}
