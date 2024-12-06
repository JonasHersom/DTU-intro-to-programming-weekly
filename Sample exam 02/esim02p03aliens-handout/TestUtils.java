// Do not modify this file!

import java.lang.reflect.Modifier;

class TestUtils {
    public static void displayAliens(Alien[] aliens) {
        System.out.println("List of aliens:");
        for (var a: aliens) {
            System.out.println(" - " + a.description());
        }
    }
}