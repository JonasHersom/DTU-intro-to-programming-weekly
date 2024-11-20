class GameUtils {
    public static Monster[][] createPlayground(int rows, int columns) {
        var playground = new Monster[rows][columns]; 

        return playground;
    }

    public static void displayPlayground(Monster[][] playground) {
        String playgroundMap = "";
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground[i].length; j++) {
                if (playground[i][j] == null) playgroundMap += ".";
                else playgroundMap += playground[i][j].getSymbol();
            }
            if (i + 1 != playground.length) playgroundMap += System.lineSeparator();
        }
        System.out.println(playgroundMap);
    }

    public static void displayMonsters(Monster[][] playground) {
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground[i].length; j++) {
                if (playground[i][j] != null) System.out.println("Row " + i + ", column " + j + ": " + playground[i][j].getDescription());
            }
        }
    }

    public static void hit(Monster[][] playground, int pRow, int pCol, int damage) {
        int[][] directions = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0}, 
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
        };
    
        for (int[] direction : directions) {
            int newRow = pRow + direction[0];
            int newCol = pCol + direction[1];
    
            if (newRow >= 0 && newRow < playground.length && 
                newCol >= 0 && newCol < playground[0].length && 
                playground[newRow][newCol] != null) {
                playground[newRow][newCol].hit(damage);
            }
        }
        
    }

    public static void burn(Monster[][] playground, int pRow, int pCol, int damage) {
        int[][] directions = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0}, 
            {1, 1}, {1, -1}, {-1, 1}, {-1, -1},
            {0, 2}, {0, -2}, {2, 0}, {-2, 0},
            {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
            {1, 2}, {1, -2}, {-1, 2}, {-1, -2},
            {2, 2}, {2, -2}, {-2, 2}, {-2, -2}
        };
    
        for (int[] direction : directions) {
            int newRow = pRow + direction[0];
            int newCol = pCol + direction[1];
    
            if (newRow >= 0 && newRow < playground.length && 
                newCol >= 0 && newCol < playground[0].length && 
                playground[newRow][newCol] != null) {
                playground[newRow][newCol].burn(damage);
            }
        }
    }
    
    
}
