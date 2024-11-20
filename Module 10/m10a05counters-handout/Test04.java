// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var counter1 = new Counter(10);
        var counter2 = new Counter(-16);

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

        System.out.println(System.lineSeparator() + "Decrementing counters...");
        counter1.decrement();
        counter1.decrement();
        counter2.decrement();
        counter2.decrement();

        System.out.println("Value of counter1: " + counter1.getValue());
        System.out.println("Value of counter2: " + counter2.getValue());
    }
}
