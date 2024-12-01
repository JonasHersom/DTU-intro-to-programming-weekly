// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        var maze = Maze.createMaze(5, 16);
        TestUtils.editMazeRandomly(maze, 97);

        System.out.println("Maze:");
        TestUtils.displayMaze(maze);

        System.out.println("Moving the player...");

        Maze.moveDown(maze);
        Maze.moveDown(maze);
        Maze.moveLeft(maze);
        Maze.moveLeft(maze);
        Maze.moveLeft(maze);
        Maze.moveLeft(maze);
        Maze.moveLeft(maze); // Should fail
        Maze.moveUp(maze);
        Maze.moveUp(maze);
        Maze.moveRight(maze);
        Maze.moveRight(maze);
        Maze.moveRight(maze); // Should fail

        System.out.println("The maze is now:");
        TestUtils.displayMaze(maze);
    }
}
