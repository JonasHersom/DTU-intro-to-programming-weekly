// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var cats = new Cat[] {
            new Cat("Kristen"),
            new Cat("Ellen"),
            new NorwegianForestCat("Mads"),
            new NorwegianForestCat("Ingeborg")
        };

        System.out.println("Cats:");
        for (var c: cats) {
            System.out.println("  - " + c.getDescription()
                                + "; sound: " + c.getSound());
        }
    }
}
