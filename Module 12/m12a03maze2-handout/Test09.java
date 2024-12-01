// Do not modify this file!

class Test09 {
    public static void main(String[] args) throws java.io.IOException {
        var rows = 6;
        var cols = 16;
        var filename = "maze09.txt";

        var maze = Maze.createMaze(rows, cols);
        TestUtils.editMazeRandomly(maze, rows + cols);
        System.out.println("Maze of size " + rows + "x" + cols + ":");
        TestUtils.displayMaze(maze);

        System.out.println("");
        System.out.println("Saving file: " + filename + "...");
        Maze.save(maze, filename);

        System.out.println("");
        TestUtils.displayFile(filename);
    }
}
