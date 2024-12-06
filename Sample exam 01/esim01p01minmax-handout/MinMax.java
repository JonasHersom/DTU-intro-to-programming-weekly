class MinMax {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);

        String minOrMax = args[0]; 
        int minNumber = 101;
        int maxNumber = 0;
        String minString = "Minimum value: ";
        String maxString = "Maximum value: ";

        while (scanner.hasNext()) {
            int currentNumber = scanner.nextInt();
            if (minOrMax.toLowerCase().equals("min") || minOrMax.toLowerCase().equals("minmax")) {
                if (currentNumber < minNumber) {
                    minNumber = currentNumber;
                }
            }
            if (minOrMax.toLowerCase().equals("max") || minOrMax.toLowerCase().equals("minmax")) {
                if (currentNumber > maxNumber) { 
                    maxNumber = currentNumber;
                }
                
            }
        }
        scanner.close();
        if (minOrMax.toLowerCase().equals("min") || minOrMax.toLowerCase().equals("minmax")) System.out.println(minString + minNumber);
        if (minOrMax.toLowerCase().equals("max") || minOrMax.toLowerCase().equals("minmax")) System.out.println(maxString + maxNumber);
    }
}
