// Do not modify this file!

class TestUtils {
    public static void displayBoard(char[][] board) {
        for (var row: board) {
            for (var square: row) {
                System.out.print(square);
            }
            System.out.println(""); // Line separator
        }
    }
}
