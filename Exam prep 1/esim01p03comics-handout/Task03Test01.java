// Do not modify this file!

class Task03Test01 {
    public static void main(String[] args) throws java.io.IOException {
        var filename = "comics1.txt";

        var comics = new Comic[] {
            new Comic("Batgirl", 2, "Son of Penguin", 2017),
            new IronMan(13, "Stark Wars", 2015),
            new WonderWoman(181, "The Wrath of Dr. Cyber", 1969)
        };

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
