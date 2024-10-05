// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        System.out.println("Creating a few BarfBag objects...");

        var bag1 = new BarfBag(1, "SAS", 2023, 25);
        var bag2 = new BarfBag(13, "Alitalia", 1991, 2300.10);
        var bag3 = new BarfBag(42, "Air France", 2010, 450.0);

        System.out.println("id: " + bag1.id + "; airline: " + bag1.airline
                           + "; year: " + bag1.year + "; value: " + bag1.value);
        System.out.println("id: " + bag2.id + "; airline: " + bag2.airline
                           + "; year: " + bag2.year + "; value: " + bag2.value);
        System.out.println("id: " + bag3.id + "; airline: " + bag3.airline
                           + "; year: " + bag3.year + "; value: " + bag3.value);
    }
}
