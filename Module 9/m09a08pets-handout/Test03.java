// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var dogs = new Dog[] {
            new Dog("Brille"),
            new Greyhound("Gnavpot"),
            new Chihuahua("Lystig"),
            new Greyhound("Flovmand"),
            new Chihuahua("Prosit")
        };

        System.out.println("Dogs:");
        for (var d: dogs) {
            System.out.println("  - " + d.getDescription()
                                + "; sound: " + d.getSound());
        }
    }
}
