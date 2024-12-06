class Distance {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        scanner.close();

        double distanceFormula = Math.abs(a * x - y + b) / Math.sqrt(1 + a * a);
        System.out.println("The distance is " + distanceFormula);
    }
}
