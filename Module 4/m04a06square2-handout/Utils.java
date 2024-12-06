class Utils {
    static String createSquare(int size) {

        int i = size;
        int j = size;
        String square = "";

        while (i != 0) {
            while (j != 0) {
                square = square + "#";
                j = j - 1;
            }
            square = square + System.lineSeparator();
            j = size;
            i = i - 1;
    }
    return square;
}
}