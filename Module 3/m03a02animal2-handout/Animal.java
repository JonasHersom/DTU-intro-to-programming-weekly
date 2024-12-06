class Animal {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        System.out.println("Is the animal a bird?");
        String answer1 = scanner.nextLine();
        if (answer1.toLowerCase().equals("yes")) {
            System.out.println("Does it fly?");
            String answer2 = scanner.nextLine();

            if (answer2.toLowerCase().equals("yes")) {
                System.out.println("The animal is a sparrow");
            } else if (answer2.toLowerCase().equals("no")) {System.out.println("The animal is a penguin");}
                else {System.out.println("Invalid answer!");}
        } else if (answer1.toLowerCase().equals("no")) {
            System.out.println("Does it jump?");
            String answer3 = scanner.nextLine();

            if (answer3.toLowerCase().equals("yes")) {
                System.out.println("The animal is a kangaroo");
            } else if (answer3.toLowerCase().equals("no")) {System.out.println("The animal is a camel");}
            else {System.out.println("Invalid answer!");}
        } else {System.out.println("Invalid answer!");}

        scanner.close();
    }
}
