// Do not modify this file!

class Test11 {
    public static void main(String[] args) throws java.io.IOException {
        var rows = 12;
        var cols = 32;
        var filename = "maze11.txt";

        var maze = Maze.createMaze(rows, cols);
        TestUtils.editMazeRandomly(maze, rows + cols + 42);
        System.out.println("Maze of size " + rows + "x" + cols + ":");
        TestUtils.displayMaze(maze);

        System.out.println("");
        System.out.println("Saving file: " + filename + "...");
        Maze.save(maze, filename);

        System.out.println("");
        TestUtils.displayFile(filename);

        System.out.println("");
        System.out.println("Reloading the file '" + filename + "'...");
        try {
            var maze2 = Maze.load(filename);
            TestUtils.displayMaze(maze2);
        } catch (java.io.IOException e) {
            System.out.println("Error!");
        }
    }
}
