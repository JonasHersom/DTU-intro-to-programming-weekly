class AnimalSounds {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        while (scanner.hasNextLine()) { 
            String animal = scanner.nextLine();
            switch (animal.toLowerCase()) {
                case "dog" -> System.out.println("Woof");
                case "cat" -> System.out.println("Meow");
                case "sheep" -> System.out.println("Baa");
                case "cow" -> System.out.println("Moo");
                case "lion" -> System.out.println("Roar");
                case "pig" -> System.out.println("Oink");
                case "duck" -> System.out.println("Quack");
                default -> System.out.println("?");
            }
    }
}
}
