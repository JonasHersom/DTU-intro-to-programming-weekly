class Maze {
    public static char[][] createMaze(int rows, int cols) {
        var maze = new char[rows][cols];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = ' ';
            }
        }
        return maze;
    }

    public static boolean moveUp(char[][] maze) {
        var playerLocation = findPlayer(maze);
        if (playerLocation[0] == 0) return false;

        if (maze[playerLocation[0] - 1][playerLocation[1]] == ' ') {
            maze[playerLocation[0] - 1][playerLocation[1]] = 'X';
            maze[playerLocation[0]][playerLocation[1]] = ' ';
            return true;
        }
        return false;

    }
    public static boolean moveDown(char[][] maze) {
        var playerLocation = findPlayer(maze);
        if (playerLocation[0] == maze.length - 1) return false;

        if (maze[playerLocation[0] + 1][playerLocation[1]] == ' ') {
            maze[playerLocation[0] + 1][playerLocation[1]] = 'X';
            maze[playerLocation[0]][playerLocation[1]] = ' ';
            return true;
        }
        return false;

    }
    public static boolean moveLeft(char[][] maze) {
        var playerLocation = findPlayer(maze);
        if (playerLocation[1] == 0) return false;

        if (maze[playerLocation[0]][playerLocation[1] - 1] == ' ') {
            maze[playerLocation[0]][playerLocation[1] - 1] = 'X';
            maze[playerLocation[0]][playerLocation[1]] = ' ';
            return true;
        }
        return false;
    }
    public static boolean moveRight(char[][] maze) {
        var playerLocation = findPlayer(maze);
        if (playerLocation[0] == maze[0].length - 1) return false;


        if (maze[playerLocation[0]][playerLocation[1] + 1] == ' ') {
            maze[playerLocation[0]][playerLocation[1] + 1] = 'X';
            maze[playerLocation[0]][playerLocation[1]] = ' ';
            return true;
        }
        return false;
    }

    public static int[] findPlayer(char[][] maze) {
        var playerCoords = new int[2];

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'X') {
                    playerCoords[0] = i;
                    playerCoords[1] = j;
                    return playerCoords;
                } 
            }
        }
        return playerCoords;
    }
    
    public static char[][] load(String fname) throws java.io.IOException {
        var file = new java.io.File(fname);
        var scanner = new java.util.Scanner(file);
        scanner.useLocale(java.util.Locale.ENGLISH);
        String sizeLine = scanner.nextLine();
        var size = sizeLine.split(",");
        var maze = new char[Integer.parseInt(size[0])][Integer.parseInt(size[1])];

        for (int i = 0; i < maze.length; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = line.charAt(j);
            }
        }
        scanner.close();

        return maze;
    }

    public static void save(char[][] maze, String fname) throws java.io.IOException {
        String mazeString = maze.length + "," + maze[0].length + System.lineSeparator();
        
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                mazeString += maze[i][j]; 
            }
            mazeString += System.lineSeparator();
        }
        var printer = new java.io.PrintWriter(fname);
        printer.print(mazeString);
        printer.close();

    }
}
