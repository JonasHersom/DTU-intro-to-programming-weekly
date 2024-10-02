// Do not modify this file!

class Maximum {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();

        scanner.close();

        var maximum = Utils.max(a, b, c);

        System.out.println("The maximum between " + a + ", " + b + ", and " + c
                            + " is: " + maximum);
    }
}
