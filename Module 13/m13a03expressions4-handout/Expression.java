public interface Expression {
    public double result();
    public String format();
    public Expression substitute(String varName, Expression eSubst);
}   

abstract class BinaryOperation implements Expression {
    public Expression value1;
    public Expression value2;
    public char operator;

    BinaryOperation(Expression value1, Expression value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double result() {
        switch (operator) {
            case '+':
                return this.value1.result() + this.value2.result();
            case '-':
                return this.value1.result() - this.value2.result();
            case '*':
                return this.value1.result() * this.value2.result();
            case '/':
                return this.value1.result() / this.value2.result();
            default: return 0;
        }
    }

    public Expression substitute(String varName, Expression eSubst) {
        switch (operator) {
            case '+':
                return new Addition(value1.substitute(varName, eSubst), value2.substitute(varName, eSubst));
            case '-':
                return new Subtraction(value1.substitute(varName, eSubst), value2.substitute(varName, eSubst));
            case '*':
                return new Multiplication(value1.substitute(varName, eSubst), value2.substitute(varName, eSubst));
            case '/':
                return new Division(value1.substitute(varName, eSubst), value2.substitute(varName, eSubst));
            default: return this;
        }
    }

    public String format() {
        return "(" + this.value1.format() + " " + operator + " " + this.value2.format() + ")";
    }
}

class Variable implements Expression {
    private String varName;

    public Variable(String varName) {
        this.varName = varName;
    }

    public String format() {
        return this.varName;
    }

    public double result() {
        throw new ArithmeticException("Undefined variable: " + this.varName);
    }

    public Expression substitute(String varName, Expression eSubst) {
        if (this.varName.equals(varName)) return eSubst;
        else return this;
    }

}

class Constant implements Expression {
    private double value;

    public Constant(double value) {
        this.value = value;
    }
    public double result() {
        return this.value;
    }
    public String format() {
        return Double.toString(this.value);
    }
    public Expression substitute(String varName, Expression eSubst) {
        return this;
    }

}

class Addition extends BinaryOperation{

    public Addition(Expression value1, Expression value2) {
        super(value1, value2);
        this.operator = '+';
    }

    public Expression substitute(String varName, Expression eSubst) {
        return new Addition(value1.substitute(varName, eSubst), value2.substitute(varName, eSubst));
    }
}
class Subtraction extends BinaryOperation{

    public Subtraction(Expression value1, Expression value2) {
        super(value1, value2);
        this.operator = '-';
    }
}
class Multiplication extends BinaryOperation{

    public Multiplication(Expression value1, Expression value2) {
        super(value1, value2);
        this.operator = '*';
    }
}
class Division extends BinaryOperation{

    public Division(Expression value1, Expression value2) {
        super(value1, value2);
        this.operator = '/';
    }
}
abstract class UnaryOperation implements Expression {
    public Expression value1;
    public String operator;

    
    public UnaryOperation(Expression value1) {
        this.value1 = value1;
    }

    public double result() {
        switch (operator) {
            case "-":
                return this.value1.result() * (-1);
            case "abs":
                return Math.abs(this.value1.result());
            case "sqrt":
                return Math.sqrt(this.value1.result()) ;
            default: return 0;
        }
    }

    public Expression substitute(String varName, Expression eSubst) {
        switch (operator) {
            case "-":
                return new Minus(value1.substitute(varName, eSubst));
            case "abs":
                return new AbsoluteValue(value1.substitute(varName, eSubst));
            case "sqrt":
                return new SquareRoot(value1.substitute(varName, eSubst));
            default: return this;
        }
    }

        public String format() {
            return operator + "(" + this.value1.format() + ")";
        }
    
}

class Minus extends UnaryOperation {
    public Minus(Expression value1) {
        super(value1);
        this.operator = "-";
    }
}

class AbsoluteValue extends UnaryOperation {
    public AbsoluteValue(Expression value1) {
        super(value1);
        this.operator = "abs";
    }
}

class SquareRoot extends UnaryOperation {
    public SquareRoot(Expression value1) {
        super(value1);
        this.operator = "sqrt";
    }
}