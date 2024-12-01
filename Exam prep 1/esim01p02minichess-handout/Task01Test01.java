// Do not modify this file!

class Task01Test01 {
    public static void main(String[] args) {
        var board1 = MiniChess.createEmptyBoard(5);
        board1[1][2] = 'R';
        board1[1][3] = 'B';
        board1[4][4] = 'B';

        System.out.println("Board 1:");
        TestUtils.displayBoard(board1);

        System.out.println("");

        var board2 = MiniChess.createEmptyBoard(8);
        board2[2][4] = 'B';
        board2[3][1] = 'R';
        board2[4][5] = 'B';
        board2[7][0] = 'R';

        System.out.println("Board 2:");
        TestUtils.displayBoard(board2);
    }
}
