// Do not modify this file!

class Occurrences {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var s = scanner.nextLine(); // String to look for in the array

        // Number of strings to read into the array
        var n = Integer.parseInt(scanner.nextLine());

        var strings = new String[n];

        // Read 'n' values of type 'double' from the console (one by one) and
        // store them in the array 'values'
        for (var i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        scanner.close();

        var count = Utils.count(s, strings);

        System.out.println("The string '" + s + "' occurs " + count + " time(s)");
    }
}
