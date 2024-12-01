// Do not modify this file!

class Task02Test02 {
    public static void main(String[] args) {
        var board = MiniChess.createEmptyBoard(6);
        board[1][2] = 'R';
        board[1][3] = 'B';
        board[4][4] = 'R';

        System.out.println("Board:");
        TestUtils.displayBoard(board);

        System.out.println("");

        System.out.print("Moving rook from (1,3) to (1,0)... ");
        if (MiniChess.moveRook(board, 1, 3, 1, 0)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving rook from (1,2) to (0,1)... ");
        if (MiniChess.moveRook(board, 1, 2, 0, 1)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving rook from (1,2) to (1,-3)... ");
        if (MiniChess.moveRook(board, 1, 2, 1, -3)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving rook from (1,2) to (6,2)... ");
        if (MiniChess.moveRook(board, 1, 2, 6, 2)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving rook from (1,2) to (5,2)... ");
        if (MiniChess.moveRook(board, 1, 2, 5, 2)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
    }
}
