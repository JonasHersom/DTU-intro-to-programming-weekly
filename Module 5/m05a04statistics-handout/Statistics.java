class Statistics {
    public static void main(String[] args) {
        double[] numbers = parseInput();
        double total = 0;
        for (double x: numbers) {
            total = x + total;
        }
        double mean = total / numbers.length;
        double standardDeviation = 0.0;
        for (double num : numbers) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        System.out.println("Mean: " + mean);
        System.out.println("Standard deviation: " + Math.sqrt(standardDeviation / numbers.length));
}

    private static double[] parseInput() {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        var input = scanner.nextLine();
        scanner.close();

        var split = input.split("; ");
        var values = new double[split.length]; 
        for (int i = 0; i < values.length; i++) {
            values[i] = Double.parseDouble(split[i]);
        }
        return values;
    }
}
