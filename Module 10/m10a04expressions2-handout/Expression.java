public interface Expression {
    public double result();
    public String format();
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
    public String format() {
        return "(" + this.value1.format() + " " + operator + " " + this.value2.format() + ")";
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
}

class Addition extends BinaryOperation{

    public Addition(Expression value1, Expression value2) {
        super(value1, value2);
        this.operator = '+';
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