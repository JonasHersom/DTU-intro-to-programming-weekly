class Quadratic {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        scanner.close();
        
        double d = (b * b) - 4 * a * c;
        double root1 = (- b + Math.sqrt(d)) / 2 * a;
        double root2 = (- b - Math.sqrt(d)) / 2 * a;
        
        if (a == 0 && b == 0 && c == 0) {System.out.println("Infinitely many roots");}
        else if (a == 0 && b == 0 || b == 0) {System.out.println("No roots");}
        else if (a == 0) {System.out.println("1.0");}
        else if (d >= 1) {System.out.println(root1 + " " + root2);}
        else if (d == 0) {System.out.println(root1);}

    }
}
