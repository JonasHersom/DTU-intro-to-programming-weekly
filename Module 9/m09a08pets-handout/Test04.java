// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var cats = new Cat[] {
            new Cat("Agnetha"),
            new Cat("Bjorn"),
            new Cat("Benny"),
            new Cat("Anni-Frid")
        };

        System.out.println("Cats:");
        for (var c: cats) {
            System.out.println("  - " + c.getDescription()
                                + "; sound: " + c.getSound());
        }
    }
}
