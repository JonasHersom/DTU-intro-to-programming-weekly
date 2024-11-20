// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var counter1 = new Counter(0);
        var counter2 = new Counter(42);

        System.out.println("Value of counter1: " + counter1.getValue());
        System.out.println("Value of counter2: " + counter2.getValue());

        System.out.println(System.lineSeparator() + "Changing counters...");
        counter1.setValue(counter2.getValue() * 2);
        counter2.setValue(counter2.getValue() / 2);

        System.out.println("Value of counter1: " + counter1.getValue());
        System.out.println("Value of counter2: " + counter2.getValue());

        System.out.println(System.lineSeparator() + "Incrementing counters...");
        counter1.increment();
        counter2.increment();

        System.out.println("Value of counter1: " + counter1.getValue());
        System.out.println("Value of counter2: " + counter2.getValue());
    }
}
