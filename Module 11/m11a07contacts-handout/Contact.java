class Contact {
    // Write your code here

    /**
     * Is the given character a digit?
     * @param c The character to check
     * @return true if the argument 'c' is a digit, false otherwise
     */
    private static boolean isDigit(char c) {
        return ((c >= '0') && (c <= '9'));
    }

    /**
     * Is the given character a letter?
     * @param c The character to check
     * @return true if the argument 'c' is a digit, false otherwise
     */
    private static boolean isLetter(char c) {
        return (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')));
    }
}
