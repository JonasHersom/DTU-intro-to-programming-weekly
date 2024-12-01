// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var maze = Maze.createMaze(6, 4);
        TestUtils.editMazeRandomly(maze, 32);
        TestUtils.testMoves(maze);
    }
}
