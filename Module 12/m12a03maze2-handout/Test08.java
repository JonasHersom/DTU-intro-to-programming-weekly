// Do not modify this file!

class Test08 {
    public static void main(String[] args) {
        var filename = "maze08.txt";

        System.out.println("Loading the file '" + filename + "'...");
        try {
            var maze = Maze.load(filename);
            TestUtils.displayMaze(maze);
        } catch (java.io.IOException e) {
            System.out.println("Error!");
        }
    }
}
