class SumMean {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        int input = scanner.nextInt();
        double sum = 0;

        for (int i = 0; i < input; i++) {
            double number = scanner.nextDouble();

            sum = sum + number;
        }

        scanner.close();

        System.out.println("The sum of the " + input + " given values is: " + sum);
        if (input != 0) { System.out.println("The mean of the " + input + " given values is: " + (sum / input)); }

    }
}
