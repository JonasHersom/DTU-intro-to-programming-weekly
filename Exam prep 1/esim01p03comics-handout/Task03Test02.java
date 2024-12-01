// Do not modify this file!

class Task03Test02 {
    public static void main(String[] args) throws java.io.IOException {
        var filename = "comics2.txt";

        var comics = new Comic[] {}; // Empty array

        System.out.println("Saving file: " + filename + "...");
        Comic.saveComics(comics, filename);

        System.out.println("");
        System.out.println("Contents of " + filename + ":");
        System.out.println("- - - - - - - Contents begin here - - - - - - -");
        for (var l: java.nio.file.Files.readAllLines(java.nio.file.Paths.get(filename))) {
            System.out.println(l);
        }
        System.out.println("- - - - - - - - Contents end here - - - - - - -");
    }
}
