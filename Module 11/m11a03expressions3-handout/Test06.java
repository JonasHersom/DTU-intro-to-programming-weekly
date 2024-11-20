// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        var e = new SquareRoot(new AbsoluteValue(new Minus(new Constant(25))));

        System.out.println("Formatted expression: " + e.format());
        System.out.println("Result of the expression: " + e.result());
    }
}
