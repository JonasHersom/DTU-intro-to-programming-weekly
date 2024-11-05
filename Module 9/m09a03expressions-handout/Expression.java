public interface Expression {
    public double result();
    public String format();
}   

class Constant implements Expression{
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

class Addition implements Expression{
    private Expression value1;
    private Expression value2;

    public Addition(Expression value1, Expression value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double result() {
        return this.value1.result() + this.value2.result();
    }
    public String format() {
        return "(" + this.value1.format() + " + " + this.value2.format() + ")";
    }
}
class Subtraction implements Expression{
    private Expression value1;
    private Expression value2;

    public Subtraction(Expression value1, Expression value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double result() {
        return this.value1.result() - this.value2.result();
    }
    public String format() {
        return "(" + this.value1.format() + " - " + this.value2.format() + ")";
    }
}
class Multiplication implements Expression{
    private Expression value1;
    private Expression value2;

    public Multiplication(Expression value1, Expression value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double result() {
        return this.value1.result() * this.value2.result();
    }
    public String format() {
        return "(" + this.value1.format() + " * " + this.value2.format() + ")";
    }
}
class Division implements Expression{
    private Expression value1;
    private Expression value2;

    public Division(Expression value1, Expression value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double result() {
        return this.value1.result() / this.value2.result();
    }
    public String format() {
        return "(" + this.value1.format() + " / " + this.value2.format() + ")";
    }
}