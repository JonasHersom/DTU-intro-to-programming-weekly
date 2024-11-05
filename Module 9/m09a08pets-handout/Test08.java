// Do not modify this file!

class Test08 {
    public static void main(String[] args) {
        var pets = new Pet[] {
            new Pet("Frida", "pangolin"),
            new Dog("Stan"),
            new Greyhound("Leopold"),
            new Chihuahua("Blidelille"),
            new Cat("Mikkel Mikkelsen"),
            new NorwegianForestCat("Simba"),
            new Frog("Gertrud"),
            new HornedFrog("Valdemar")
        };

        System.out.println("Pets:");
        for (var p: pets) {
            System.out.println("  - " + p.getDescription()
                                + "; sound: " + p.getSound());
        }
    }
}
