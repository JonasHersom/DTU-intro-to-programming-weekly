class Pyramid {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        int pyramidHeight = scanner.nextInt();
        int x = 0;
        scanner.close();

        String pyramid = "";

        for (int lineX = 0; lineX < pyramidHeight; lineX++) {
            for (int amountOfDots = 0; amountOfDots < pyramidHeight - 1 - x; amountOfDots++) {
                pyramid = pyramid + ".";
            }
            for (int amountOfTags = 0; amountOfTags < 1 + x * 2; amountOfTags++) {
                pyramid = pyramid + "#";
            }
            for (int amountOfDots = 0; amountOfDots < pyramidHeight - 1 - x; amountOfDots++) {
                pyramid = pyramid + ".";
            }
            x++;
            if (x < pyramidHeight) pyramid = pyramid + System.lineSeparator();
        }
        System.out.println(pyramid);
    }
}
