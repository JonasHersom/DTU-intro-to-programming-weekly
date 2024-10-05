// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        System.out.println("Creating a few BarfBag objects...");

        var bag1 = new BarfBag(1, "SAS", 2023, 25);
        var bag2 = new BarfBag(13, "Alitalia", 1991, 2300.10);
        var bag3 = new BarfBag(42, "Air France", 2010, 450.0);

        System.out.println(bag1.description());
        System.out.println(bag2.description());
        System.out.println(bag3.description());
    }
}
