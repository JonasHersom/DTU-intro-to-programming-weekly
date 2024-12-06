// Do not modify this file!

class Task02Test01 {
    public static void main(String[] args) {
        var board = MiniChess.createEmptyBoard(5);
        board[1][2] = 'R';
        board[1][3] = 'B';
        board[4][4] = 'R';

        System.out.println("Board:");
        TestUtils.displayBoard(board);

        System.out.println("");

        System.out.print("Moving rook from (1,2) to (1,2)... ");
        if (MiniChess.moveRook(board, 1, 2, 1, 2)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving rook from (1,4) to (3,4)... ");
        if (MiniChess.moveRook(board, 1, 4, 3, 4)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving rook from (1,2) to (1,4)... ");
        if (MiniChess.moveRook(board, 1, 2, 1, 4)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving rook from (4,4) to (1,4)... ");
        if (MiniChess.moveRook(board, 4, 4, 1, 4)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving rook from (1,4) to (3,4)... ");
        if (MiniChess.moveRook(board, 1, 4, 3, 4)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
    }
}
