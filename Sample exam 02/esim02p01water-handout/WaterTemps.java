class WaterTemps {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        String input = scanner.nextLine();

        double averageTemp = 0;
        int i = 0;
        double totalTemp = 0;
        
        double lastTemp = -999999999;
        int drops = 0;

        while (scanner.hasNext()) {
            double currentTemp = scanner.nextDouble();
            if (input.equals("average") || input.equals("drops,average") || input.equals("average,drops")) {
                i++;
                totalTemp += currentTemp;
            }

            if (input.equals("drops") || input.equals("drops,average") || input.equals("average,drops")) {
                if (lastTemp > currentTemp) drops++;
                lastTemp = currentTemp;
            }
        }
        scanner.close();

        averageTemp = totalTemp / i;
        if (input.equals("drops") || input.equals("drops,average")) System.out.println("Number of temperature drops: " + drops);
        if (input.equals("average") || input.equals("drops,average")) System.out.println("Average temperature: " + averageTemp);
        if (input.equals("average,drops")) System.out.println("Average temperature: " + averageTemp);
        if (input.equals("average,drops")) System.out.println("Number of temperature drops: " + drops);
    }
}
