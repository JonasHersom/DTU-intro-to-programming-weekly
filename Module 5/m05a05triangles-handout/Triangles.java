class Triangles {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        String angle = "";
        double lengthA = scanner.nextDouble();
        double lengthB = scanner.nextDouble();
        double lengthC = scanner.nextDouble();
    
        scanner.close();

        double cosA = Math.acos(((lengthB * lengthB) + (lengthC * lengthC) - (lengthA * lengthA)) / (2 * lengthB * lengthC));
        double cosB = Math.acos(((lengthA * lengthA) + (lengthC * lengthC) - (lengthB * lengthB)) / (2 * lengthA * lengthC));
        double cosC = Math.acos(((lengthA * lengthA) + (lengthB * lengthB) - (lengthC * lengthC)) / (2 * lengthA * lengthB));
        
        double angleA = cosA * 180 / Math.PI;
        double angleB = cosB * 180 / Math.PI;
        double angleC = cosC * 180 / Math.PI;
        
        if (angleA == 90 || angleB == 90 || angleC == 90) angle = "Right";
        else if (angleA < 90 && angleB < 90 && angleC < 90) angle = "Acute";
        else if (angleA > 90 && angleA < 180|| angleB > 90 && angleB < 180 || angleC > 90 && angleC < 180) angle = "Obtuse";
        else if (angleA >= 180 || angleB >= 180 || angleC >= 180) angle = "Degenerate";

        System.out.println(angle);


    }
}
