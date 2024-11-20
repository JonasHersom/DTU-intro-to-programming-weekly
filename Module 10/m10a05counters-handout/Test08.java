// Do not modify this file!

class Test08 {
    public static void main(String[] args) {
        System.out.println("Static counter value: " + StaticCounter.getValue());

        System.out.println(System.lineSeparator() + "Changing the counter...");
        StaticCounter.setValue(-33);

        System.out.println("Static counter value: " + StaticCounter.getValue());

        System.out.println(System.lineSeparator() + "Incrementing the counter...");
        StaticCounter.increment();

        System.out.println("Static counter value: " + StaticCounter.getValue());

        System.out.println(System.lineSeparator() + "Decrementing the counter...");
        StaticCounter.decrement();
        StaticCounter.decrement();
        StaticCounter.decrement();

        System.out.println("Static counter value: " + StaticCounter.getValue());
    }
}
