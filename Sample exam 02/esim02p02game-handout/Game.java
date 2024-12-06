class Game {
    public static char[][] createPlayfield(int rows, int columns) {
        var playfield = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                playfield[i][j] = '.';
            }
        }
        return playfield;
    }
    public static boolean move(char[][] playfield, String direction) {

        var playerLocation = findPlayer(playfield).split(",");
        int pRow = Integer.parseInt(playerLocation[0]);
        int pCol = Integer.parseInt(playerLocation[1]);

        if (direction.equals("up")) {
            if (pRow == 0) return false;

            if (playfield[pRow - 1][pCol] == '#') {
                if (pRow == 1) return false;
                if (playfield[pRow - 2][pCol] == '#') return false;
                
                playfield[pRow][pCol] = '.';
                playfield[pRow - 1][pCol] = 'X';
                playfield[pRow - 2][pCol] = '#';
                return true;
            } 
            playfield[pRow][pCol] = '.';
            playfield[pRow - 1][pCol] = 'X';
            return true;
            
        }
        else if (direction.equals("down")) {
            if (pRow == playfield.length - 1) return false;
            if (playfield[pRow + 1][pCol] == '#') {
                if (pRow == playfield.length - 2) return false;
                if (playfield[pRow + 2][pCol] == '#') return false;
                
                playfield[pRow][pCol] = '.';
                playfield[pRow + 1][pCol] = 'X';
                playfield[pRow + 2][pCol] = '#';
                return true;
            } 
            playfield[pRow][pCol] = '.';
            playfield[pRow + 1][pCol] = 'X';
            return true;
        }
        else if (direction.equals("left")) {
            if (pCol == 0) return false;
            if (playfield[pRow][pCol - 1] == '#') {
                if (pCol == 1) return false;
                if (playfield[pRow][pCol - 2] == '#') return false;
                
                playfield[pRow][pCol] = '.';
                playfield[pRow][pCol - 1] = 'X';
                playfield[pRow][pCol - 2] = '#';
                return true;
            } 
            playfield[pRow][pCol] = '.';
            playfield[pRow][pCol - 1] = 'X';
            return true;
        }
        else if (direction.equals("right")) {
            if (pCol == playfield[0].length - 1) return false;
            if (playfield[pRow][pCol + 1] == '#') {
                if (pCol == playfield[0].length - 2) return false;
                if (playfield[pRow][pCol + 2] == '#') return false;
                
                playfield[pRow][pCol] = '.';
                playfield[pRow][pCol + 1] = 'X';
                playfield[pRow][pCol + 2] = '#';
                return true;
            } 
            playfield[pRow][pCol] = '.';
            playfield[pRow][pCol + 1] = 'X';
            return true;
        }
        else return false;
    }

    public static String findPlayer(char[][] playfield) {
        for (int i = 0; i < playfield.length; i++) {
            for (int j = 0; j < playfield[0].length; j++) {
                if (playfield[i][j] == 'X') return i + "," + j;
            }
        }
        return -1 + "," + -1; // should never trigger
    }
}
