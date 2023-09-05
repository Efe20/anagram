package de.beyonnex.services;


public final class AnagramCheckerService implements AnagramChecker {


    private String firstSentence;


    private String secondSentence;

    /**
     * Special characters
     */
    private static String WHITESPACES = "\\s";
    private static String COMMA = ",";
    private static String POINT = "\\.";
    private static String APOSTROPH = "'";
    private static String DOUBLE_DOT = ":";
    private static String QUOTATION_MARK = "\"";

    private String replaceSpecialCharacter(String s) {
        s = s.replaceAll(WHITESPACES, "");
        s = s.replaceAll(COMMA, "");
        s = s.replaceAll(APOSTROPH, "");
        s = s.replaceAll(POINT, "");
        s = s.replaceAll(DOUBLE_DOT, "");
        s = s.replaceAll(QUOTATION_MARK, "");
        return s;
    }

    public AnagramCheckerService(final String firstSentence, final String secondSentence) {
        this.firstSentence = firstSentence;
        this.secondSentence = secondSentence;
    }

    /**
     * Check if texts are anagram.
     *
     * @return Boolean if anagram.
     */
    @Override
    public boolean textsAreAnagram() {
        // Replace special characters
        this.firstSentence = replaceSpecialCharacter(this.firstSentence);
        this.secondSentence = replaceSpecialCharacter(this.secondSentence);

        // Convert strings to char arrays, uppercase char values and check for anagram
        return new BoolAnagramOf(
                new SentenceCharCounter(this.firstSentence).uppercaseMap(),
                new SentenceCharCounter(this.secondSentence).uppercaseMap()
        ).areAnagram();
    }

    /**
     * Alternative way of checking if texts are anagram
     * @return
     */
    // public boolean areAnagrams() {
    //     // Replace special characters
    //     this.firstSentence = replaceSpecialCharacter(this.firstSentence);
    //     this.secondSentence = replaceSpecialCharacter(this.secondSentence);
//
    //     // Check if lengths are equal
    //     if (this.firstSentence.length() != this.secondSentence.length()) {
    //         return false;
    //     }
//
    //     // Convert strings to char arrays, uppercase char values and sort them
    //     char[] chars1 = this.firstSentence.toUpperCase().toCharArray();
    //     char[] chars2 = this.secondSentence.toUpperCase().toCharArray();
    //     Arrays.sort(chars1);
    //     Arrays.sort(chars2);
//
    //     // Compare sorted char arrays
    //     return Arrays.equals(chars1, chars2);
    // }
}
