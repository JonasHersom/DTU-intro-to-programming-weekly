// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var dogs = new Dog[] {
            new Dog("Rip"),
            new Dog("Rap"),
            new Dog("Rup")
        };

        System.out.println("Dogs:");
        for (var d: dogs) {
            System.out.println("  - " + d.getDescription()
                                + "; sound: " + d.getSound());
        }
    }
}
