class Multiples {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.close();

        for (int i = 0; m >= i; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }
}
