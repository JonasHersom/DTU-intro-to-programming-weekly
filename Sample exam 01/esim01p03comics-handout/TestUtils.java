// Do not modify this file!

class TestUtils {
    public static void displayComics(Comic[] comics) {
        System.out.println("List of comics:");
        for (var c: comics) {
            System.out.println(" - " + c.getDescription());
        }
    }
}
