// Do not modify this file!

class Maximum {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var n = scanner.nextInt(); // Number of values to read
        var values = new double[n];

        // Read 'n' values of type 'double' from the console (one by one) and
        // store them in the array 'values'
        for (var i = 0; i < n; i++) {
            values[i] = scanner.nextDouble();
        }

        scanner.close();

        var maximum = Utils.max(values);

        System.out.println("The maximum value is: " + maximum);
    }
}
