// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var characters = new Character[] {
            new Character("Link", 15, 15),
            new Character("Lara Croft", 17, 13),
            new Character("Doomguy", 90, 90),
            new Character("Guybrush Threepwood", 10, 10),
            new Character("Princess Peach", 12, 9)
        };

        for (var c: characters) {
            System.out.println(c.description());
        }

        System.out.println("");
        System.out.println("*** Powering up the characters...");
        System.out.println("");

        for (var c: characters) {
            c.powerUp(5);
        }

        for (var c: characters) {
            System.out.println(c.description());
        }
    }
}