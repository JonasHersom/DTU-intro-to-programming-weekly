class Counter {

    private int counter;
    public Counter(int initial) {
        this.counter = initial;
    }

    public int getValue() {
        return this.counter;
    }

    public void setValue(int value) {
        this.counter = value;
    }

    public void increment() {
        this.counter++;
    }
    public void decrement() {
        this.counter--;
    }
}
class StaticCounter {
    private static int globalCounter;

    public static int getValue() {
        return globalCounter;
    }
    public static void setValue(int value) {
        globalCounter = value;
    }
    public static void increment() {
        globalCounter++;
    }
    public static void decrement() {
        globalCounter--;        
    }
}