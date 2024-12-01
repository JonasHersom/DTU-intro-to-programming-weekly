// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var maze = Maze.createMaze(6, 4);
        TestUtils.editMazeRandomly(maze, 16);
        TestUtils.testMoves(maze);
    }
}
