// Do not modify this file!

class TestUtils {
    /**
     * Display the given maze.
     * @param maze the maze to display.
     */
    public static void displayMaze(char[][] maze) {
        // Print top maze delimiter
        System.out.println("+" + "-".repeat(maze[0].length) + "+");
        for (var row: maze) {
            System.out.print("|");
            for (var cell: row) {
                System.out.print(cell);
            }
            System.out.println("|");
        }
        // Print bottom maze delimiter
        System.out.println("+" + "-".repeat(maze[maze.length - 1].length) + "+");
    }

    /**
     * Fill part of the given maze with pseudo-random walls, and place the
     * player in a pseudo-random cell.
     *
     * @param maze the maze to edit.
     * @param seed pseudo-random number generation seed.
     */
    public static void editMazeRandomly(char[][] maze, int seed) {
        var rnd = new java.util.Random(seed); // Pseudo-random number generator
        rnd.nextBoolean(); // Discard the first boolean, that is usually true

        // Fill roughly 2/3rd of the maze with random walls
        for (var i = 0; i < ((maze.length * maze[0].length) * (2.0/3.0)); i++) {
            // Ranmdom coordinates on the maze
            var row = rnd.nextInt(maze.length);
            var col = rnd.nextInt(maze[0].length);
            maze[row][col] = '#';
        }

        // Finally, place the player
        var pRow = rnd.nextInt(maze.length);
        var pCol = rnd.nextInt(maze[0].length);
        maze[pRow][pCol] = 'X';
    }

    /**
     * Try moving the player around the given maze and display the result.
     * 
     * @param maze the maze for testing the player movements.
     */
    public static void testMoves(char[][] maze) {
        System.out.println("Maze:");
        TestUtils.displayMaze(maze);

        System.out.println("");

        System.out.print("Trying to move the player up... ");
        if (Maze.moveUp(maze)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }
        System.out.println("The maze is now:");
        TestUtils.displayMaze(maze);

        System.out.println("");

        System.out.print("Trying to move the player left... ");
        if (Maze.moveLeft(maze)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }
        System.out.println("The maze is now:");
        TestUtils.displayMaze(maze);

        System.out.println("");

        System.out.print("Trying to move the player down... ");
        if (Maze.moveDown(maze)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }
        System.out.println("The maze is now:");
        TestUtils.displayMaze(maze);

        System.out.println("");

        System.out.print("Trying to move the player right... ");
        if (Maze.moveRight(maze)) {
            System.out.println("OK.");
        } else {
            System.out.println("Failed!");
        }
        System.out.println("The maze is now:");
        TestUtils.displayMaze(maze);

        System.out.println("");
    }
}
