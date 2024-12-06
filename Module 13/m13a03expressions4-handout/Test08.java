// Do not modify this file!

class Test08 {
    public static void main(String[] args) {
        var e0 = new Variable("x");
        System.out.println("Formatted expression 0: " + e0.format());
        System.out.print("Result of the expression 0: ");
        try {
             System.out.println(e0.result());
        } catch (ArithmeticException e) {
            System.out.println("ERROR - " + e.getMessage());
        }

        var e1 = e0.substitute("x", new Constant(42));

        System.out.println("");
        System.out.println("Formatted expression 1: " + e1.format());
        System.out.println("Result of the expression 1: " + e1.result());

        var e2 = new Addition(new Constant(1), new Variable("y".repeat(2)));

        System.out.println("");
        System.out.println("Formatted expression 2: " + e2.format());
        System.out.print("Result of the expression 2: ");
        try {
             System.out.println(e2.result());
        } catch (ArithmeticException e) {
            System.out.println("ERROR - " + e.getMessage());
        }

        var e3 = e2.substitute("x", new Constant(33));

        System.out.println("");
        System.out.println("Formatted expression 3: " + e3.format());
        System.out.print("Result of the expression 3: ");
        try {
             System.out.println(e3.result());
        } catch (ArithmeticException e) {
            System.out.println("ERROR - " + e.getMessage());
        }

        var e4 = e3.substitute("yy", new Multiplication(new Constant(11),
                                                        new Constant(3)));

        System.out.println("");
        System.out.println("Formatted expression 4: " + e4.format());
        System.out.println("Result of the expression 4: " + e4.result());

        var e5 = new Addition(
                       new Subtraction(
                             new Multiplication(new Variable("x"),
                                                new Constant(2.0)),
                             new Division(new Variable("y"),
                                          new Constant(5.0))),
                       new AbsoluteValue(
                             new SquareRoot(new Minus(new Variable("z")))));

        System.out.println("");
        System.out.println("Formatted expression 5: " + e5.format());
        
        var e6 = e5.substitute("x", new Constant(1.0))
                   .substitute("y", new Addition(new Variable("z"),
                                                 new Constant(34.0)))
                   .substitute("z", new Minus(new Constant(9)));

        System.out.println("");
        System.out.println("Formatted expression 6: " + e6.format());
        System.out.println("Result of the expression 6: " + e6.result());

        var e7 = e5.substitute("x", new Constant(3.2))
                   .substitute("y", new Constant(2.5))
                   .substitute("z", new Constant(-81.0));

        System.out.println("");
        System.out.println("Formatted expression 7: " + e7.format());
        System.out.println("Result of the expression 7: " + e7.result());
    }
}
