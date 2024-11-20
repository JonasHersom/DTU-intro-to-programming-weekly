// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        for (var rows = 2; rows < 8; rows = rows + 2) {
            for (var cols = 1; cols < 8; cols = cols + 3) {
                var maze = Maze.createMaze(rows, cols);
                System.out.println("Maze of size " + rows + "x" + cols + ":");
                TestUtils.displayMaze(maze);
                System.out.println(""); // Skip a line
            }
        }
    }
}
