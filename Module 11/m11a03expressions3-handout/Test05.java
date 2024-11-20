// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var e1 = new Constant(144);
        var e2 = new Constant(-144);

        var eMinus = new Minus(e1);

        System.out.println("Formatted 'minus' expression: " + eMinus.format());
        System.out.println("Result of the 'minus' expression: " + eMinus.result());

        var eAbs = new AbsoluteValue(e2);

        System.out.println("");
        System.out.println("Formatted absolute value: " + eAbs.format());
        System.out.println("Result of the absolute value: " + eAbs.result());

        var eSqrt = new SquareRoot(e1);

        System.out.println("");
        System.out.println("Formatted square root: " + eSqrt.format());
        System.out.println("Result of the square root: " + eSqrt.result());
    }
}
