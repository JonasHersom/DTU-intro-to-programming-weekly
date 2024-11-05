// Do not modify this file!

class Test07 {
    public static void main(String[] args) {
        var frogs = new Frog[] {
            new Frog("Hypnotoad"),
            new HornedFrog("Stan"),
            new HornedFrog("Ollie")
        };

        System.out.println("Frogs:");
        for (var f: frogs) {
            System.out.println("  - " + f.getDescription()
                                + "; sound: " + f.getSound());
        }
    }
}
