// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var maze = Maze.createMaze(3, 3);
        TestUtils.editMazeRandomly(maze, 42);
        TestUtils.testMoves(maze);
    }
}
