class SuperTicTacToe {
    public static String[][] createGrid(int n) {
        
        String[][] grid = new String[n][n];
        
        // does nothing but when i made it i thought it did
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = null;
            }
        }

        return grid;
    }

    public static boolean hasWinner(String[][] grid) {
        int n = grid.length;

        // checks horisontally
        for (int i = 0; i < n; i++) {
            int x = 0;
            int o = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == "X") x++;
                else if (grid[i][j] == "O") o++;
            }
            if (x == n) return true;
            else if (o == n) return true;
        }

        // checks vertically
        for (int i = 0; i < n; i++) {
            int x = 0;
            int o = 0;
            for (int j = 0; j < n; j++) {
                if (grid[j][i] == "X") x++;
                else if (grid[j][i] == "O") o++;
            }
            if (x == n) return true;
            else if (o == n) return true;
        }


        return false;
    }
}