class BarfBagsCollection {
    public static void main(String args[]) {
        var scanner = new java.util.Scanner(System.in);
        scanner.useLocale(java.util.Locale.ENGLISH);
        var nrOfBags = Integer.parseInt(scanner.nextLine());

        List<BarfBag> barfBags = new ArrayList<>();

        for (int i = 0; i < nrOfBags; i++) {
            var input = scanner.nextLine();
    
            var parts = input.split("; ");

            int id = Integer.parseInt(parts[0]);
            String airline = parts[1];
            int year = Integer.parseInt(parts[2]);
            double value = Double.parseDouble(parts[3]);

            BarfBag barfBag = new BarfBag(id, airline, year, value);
            barfBags.add(barfBag);
        }
        scanner.close();
        for (BarfBag bag : barfBags) {
            System.out.println(bag.description());
        }
    }
}

class BarfBag {
    int id;
    String airline;
    int year;
    double value;

    BarfBag(int id, String airline, int year, double value) {
        this.id = id;
        this.airline = airline;
        this.year = year;
        this.value = value;

    }
    String description() {
        return "Bag " + this.id + ": " + this.airline + " (" + this.year + "). Value: " + this.value + " DKK";
    }
}
