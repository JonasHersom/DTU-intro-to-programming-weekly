class GameUtils {
    public static Monster[][] createPlayground(int rows, int columns) {
        var playground = new Monster[rows][columns]; 

        return playground;
    }

    public static void displayPlayground(Monster[][] playground, int pRow, int pCol) {
        String playgroundMap = "";
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground[i].length; j++) {
                if (i == pRow && j == pCol) playgroundMap += "X";
                else if (playground[i][j] == null) playgroundMap += ".";
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
    public static boolean playerWins(Monster[][] playground) {
        for (int i = 0; i < playground.length; i++) {
            for (int j = 0; j < playground[i].length; j++) {
                if (playground[i][j] != null) {
                    if (playground[i][j].isDead() == false) return false;
                }
            }
        }
        return true;
    }
    public static boolean playerEaten(Monster[][] playground, int pRow, int pCol) {
        if (playground[pRow][pCol] != null) {
            if (playground[pRow][pCol].isDead() != true) return true;
        }
        return false;
    }
    public static void playGame(Monster[][] playground) {
        int pCol = 0;
        int pRow = 0;
        
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH); 
        boolean playing = true;

        while (playing && scanner.hasNextLine()) {
            String input = scanner.nextLine();
            
            switch (input.toLowerCase()) {
                case "show": {
                    GameUtils.displayPlayground(playground, pRow, pCol);
                    GameUtils.displayMonsters(playground);
                    break;
                }
                case "up": {
                    if (pRow != 0) pRow--;
                    break;
                }
                case "down": {
                    if (pRow < playground[pCol].length - 1) pRow++;
                    break;
                }
                case "left": {
                    if (pCol != 0) pCol--;
                    break;
                }
                case "right": {
                    if (pCol < playground.length - 1) pCol++;
                    break;
                }
                case "hit": {
                    GameUtils.hit(playground, pRow, pCol, 100);
                    break;
                }
                case "burn": {
                    GameUtils.burn(playground, pRow, pCol, 100);
                    break;
                }
                case "curse": {
                    Monster.curseAll();
                    break;
                }
                case "uncurse": {
                    Monster.uncurseAll();
                    break;
                }
            }
            if (playerEaten(playground, pRow, pCol)) {
                System.out.println("You were eaten by " + playground[pRow][pCol].getDescription());  
                playing = false;
                break;
            }
            if (playerWins(playground)) {
                System.out.println("You won!");
                GameUtils.displayMonsters(playground);
                playing = false;  
                break;
            }

        }
        scanner.close();
    }
}
