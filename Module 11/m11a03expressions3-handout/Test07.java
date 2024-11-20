// Do not modify this file!

class Test07 {
    public static void main(String[] args) {
        var e0 = new SquareRoot(new Constant(169));
        System.out.println("Formatted expression 0: " + e0.format());
        System.out.println("Result of the expression 0: " + e0.result());

        var e1 = new Addition(new Constant(2), e0);

        System.out.println("");
        System.out.println("Formatted expression 1: " + e1.format());
        System.out.println("Result of the expression 1: " + e1.result());

        var e2 = new Division(e1, new Constant(2));

        System.out.println("");
        System.out.println("Formatted expression 2: " + e2.format());
        System.out.println("Result of the expression 2: " + e2.result());

        var e3 = new AbsoluteValue(new Multiplication(new Constant(-2), e2));

        System.out.println("");
        System.out.println("Formatted expression 3: " + e3.format());
        System.out.println("Result of the expression 3: " + e3.result());

        var e4 = new Subtraction(new Addition(new Minus(new Constant(3)),
                                              new Constant(1)), e3);

        System.out.println("");
        System.out.println("Formatted expression 4: " + e4.format());
        System.out.println("Result of the expression 4: " + e4.result());
    }
}
