class Life {
    private boolean[][] lifeBoard;

    public Life(int rows, int columns) {
        this.lifeBoard = new boolean[rows][columns];
    }

    public void setCell(int row, int col, boolean alive) {
        this.lifeBoard[row][col] = alive;
    }
    
    public void display() {
        String boardString = "";
        for (int i = 0; i < this.lifeBoard.length; i++) {
            for (int j = 0; j < this.lifeBoard[0].length; j++) {
            if (this.lifeBoard[i][j]) boardString += '#';
            else boardString += '.';
            }
            boardString += System.lineSeparator();
        }
        System.out.print(boardString);
    }

    public void step() {
        var newBoard = new boolean[this.lifeBoard.length][this.lifeBoard[0].length];

        for (int i = 0; i < this.lifeBoard.length; i++) {
            for (int j = 0; j < this.lifeBoard[0].length; j++) {

                int neighbours = this.neighbours(i, j);
                
                if (this.lifeBoard[i][j]) {
                    if (neighbours == 2 || neighbours == 3) newBoard[i][j] = true;
                    else if (neighbours < 2) newBoard[i][j] = false; 
                }
                else if (this.lifeBoard[i][j] == false && neighbours == 3) newBoard[i][j] = true;
            }
        }
        this.lifeBoard = newBoard;
    }

    public int neighbours(int row, int col) {
        int neighbours = 0; // The following code is adapted slightly from the one I made for assignment 11-04-monsters5
        int[][] directions = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0}, 
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };
    
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
    
            if (newRow >= 0 && newRow < this.lifeBoard.length && 
                newCol >= 0 && newCol < this.lifeBoard[0].length &&
                lifeBoard[newRow][newCol] == true) neighbours++;
        }
        return neighbours;
    }

}