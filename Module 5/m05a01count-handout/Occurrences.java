// Do not modify this file!

class Occurrences {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var v = scanner.nextInt(); // Value to look for in the array
        var n = scanner.nextInt(); // Number of values to read into the array
        var values = new int[n];

        // Read 'n' values of type 'double' from the console (one by one) and
        // store them in the array 'values'
        for (var i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        scanner.close();

        var count = Utils.count(v, values);

        System.out.println("The value " + v + " occurs " + count + " time(s)");
    }
}
