class WaterTemps {

    public static void main(String[] args) {
    
    double[] temperatures = parseInput();
    double max = temperatures[0];
    double lastTemp = temperatures[0];
    int drops = 0;
    for (double currTemp: temperatures) {
        if (max < currTemp) max = currTemp;
        if (lastTemp > currTemp) drops++;
        lastTemp = currTemp;
    }

    System.out.println("Maximum water temperature: " + max);
    System.out.println("Number of temperature drops: " + drops);

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
