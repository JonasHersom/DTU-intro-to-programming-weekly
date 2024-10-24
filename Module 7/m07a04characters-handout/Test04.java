// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var characters = new Character[] {
            new Character("Link", 15, 15),
            new Character("Lara Croft", 17, 13),
            new Character("Doomguy", 90, 90),
            new Character("Guybrush Threepwood", 9, 8),
            new Character("Princess Peach", 12, 9)
        };

        for (var c1: characters) {
            for (var c2: characters) {
                System.out.println("Is " + c1.description() + " better than");
                System.out.println("   " + c2.description() + "?");
                System.out.println("   ==> " + c1.isBetterThan(c2));
                System.out.println("");
            }
        }
    }
}
