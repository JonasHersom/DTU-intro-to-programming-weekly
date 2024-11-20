// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        System.out.println("Static counter value: " + StaticCounter.getValue());

        System.out.println(System.lineSeparator() + "Changing the counter...");
        StaticCounter.setValue(42);

        System.out.println("Static counter value: " + StaticCounter.getValue());
    }
}
