// Do not modify this file!

class Task03Test02 {
    public static void main(String[] args) {
        var board = MiniChess.createEmptyBoard(6);
        board[1][2] = 'R';
        board[2][2] = 'R';
        board[1][3] = 'B';
        board[5][5] = 'B';

        System.out.println("Board:");
        TestUtils.displayBoard(board);

        System.out.println("");

        System.out.print("Moving bishop from (5,5) to (6,6)... ");
        if (MiniChess.moveBishop(board, 5, 5, 6, 6)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving bishop from (1,2) to (2,3)... ");
        if (MiniChess.moveBishop(board, 1, 2, 2, 3)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving bishop from (1,3) to (-2,0)... ");
        if (MiniChess.moveBishop(board, 1, 3, -1, 0)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving bishop from (1,3) to (0,4)... ");
        if (MiniChess.moveBishop(board, 1, 3, 0, 4)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving bishop from (0,4) to (4,0)... ");
        if (MiniChess.moveBishop(board, 0, 4, 4, 0)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
        System.out.println("");

        System.out.print("Moving bishop from (4,0) to (2,2)... ");
        if (MiniChess.moveBishop(board, 4, 0, 2, 2)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }

        System.out.println("The board is now:");
        TestUtils.displayBoard(board);
    }
}
