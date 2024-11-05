// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        var frogs = new Frog[] {
            new Frog("Rupert"),
            new Frog("Greta"),
            new Frog("Gregory")
        };

        System.out.println("Frogs:");
        for (var f: frogs) {
            System.out.println("  - " + f.getDescription()
                                + "; sound: " + f.getSound());
        }
    }
}
