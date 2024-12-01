class MiniChess {
    public static char[][] createEmptyBoard(int size) {
        var chessBoard = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                chessBoard[i][j] = '.';
            }
        }
        return chessBoard;
    }
    public static boolean moveRook(char[][] board, int r, int c, int r2, int c2) {
        if (isLegalMove(board, r, c, r2, c2, 'R') == false) return false;

        board[r][c] = '.';
        board[r2][c2] = 'R';
        return true;
        
    }

    public static boolean moveBishop(char[][] board, int r, int c, int r2, int c2) {
        if (isLegalMove(board, r, c, r2, c2, 'B') == false) return false;

        board[r][c] = '.';
        board[r2][c2] = 'B';
        return true;
        
    }

    public static boolean isLegalMove(char[][] board, int r, int c, int r2, int c2, char piece) {
        int size = board.length;
        if (
            r < 0 || r >= size || r2 < 0 || r2 >= size || c < 0 || c >= size || c2 < 0 || c2 >= size ||
            board[r][c] != piece || 
            r == r2 && c == c2 || 
            board[r2][c2] != '.' ||
            r2 == r && c2 == c
            ) return false;

        if (piece == 'R') {
             if (Math.abs(r - r2) > 0 && Math.abs(c - c2) > 0) return false;
        }
        if (piece == 'B') {
            if (Math.abs(r -r2) != Math.abs(c - c2)) return false;
        }
        return true;
    }
}
