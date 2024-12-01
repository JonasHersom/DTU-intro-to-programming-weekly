// Do not modify this file!

class Test07 {
    public static void main(String args[]) throws java.io.IOException {
        var filename = "joke2-output.txt";

        System.out.println("");
        System.out.println("Contents of file " + filename + " (should have been created by Test 6):");
        System.out.println("- - - - - - - Contents begin here - - - - - - -");
        for (var l: java.nio.file.Files.readAllLines(java.nio.file.Paths.get(filename))) {
            System.out.println(l);
        }
        System.out.println("- - - - - - - - Contents end here - - - - - - -");
    }
}
