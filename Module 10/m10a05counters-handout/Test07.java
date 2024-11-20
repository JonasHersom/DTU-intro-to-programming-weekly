// Do not modify this file!

class Test07 {
    public static void main(String[] args) {
        System.out.println("Static counter value: " + StaticCounter.getValue());

        System.out.println(System.lineSeparator() + "Changing the counter...");
        StaticCounter.setValue(333);

        System.out.println("Static counter value: " + StaticCounter.getValue());

        System.out.println(System.lineSeparator() + "Incrementing the counter...");
        StaticCounter.increment();
        StaticCounter.increment();
    }
}
