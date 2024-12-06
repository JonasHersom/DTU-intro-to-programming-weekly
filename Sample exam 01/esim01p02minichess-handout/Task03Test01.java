// Do not modify this file!

class Task03Test01 {
    public static void main(String[] args) {
        var board = MiniChess.createEmptyBoard(5);
        board[1][2] = 'R';
        board[1][3] = 'B';
        board[4][2] = 'R';

        System.out.println("Board:");
        TestUtils.displayBoard(board);

        System.out.println("");

        System.out.print("Moving bishop from (2,0) to (3,1)... ");
        if (MiniChess.moveBishop(board, 2, 0, 3, 1)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving bishop from (1,3) to (1,3)... ");
        if (MiniChess.moveBishop(board, 1, 3, 1, 3)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving bishop from (1,3) to (0,2)... ");
        if (MiniChess.moveBishop(board, 1, 3, 0, 2)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving bishop from (0,2) to (2,0)... ");
        if (MiniChess.moveBishop(board, 0, 2, 2, 0)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving bishop from (2,0) to (4,2)... ");
        if (MiniChess.moveBishop(board, 2, 0, 4, 2)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving bishop from (2,0) to (3,1)... ");
        if (MiniChess.moveBishop(board, 2, 0, 3, 1)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
    }
}
