// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkInterface(Expression.class);

        ClassTestUtils.checkInterface(Constant.class, "Expression");
        ClassTestUtils.checkConstructorImplPublic(Constant.class, new Class<?>[] {double.class});
        ClassTestUtils.checkFieldsPrivate(Constant.class);

        ClassTestUtils.checkInterface(BinaryOperation.class, "Expression");
        ClassTestUtils.checkClassAbstract(BinaryOperation.class);

        ClassTestUtils.checkSuperclass(Addition.class, BinaryOperation.class);
        ClassTestUtils.checkConstructorImplPublic(Addition.class, new Class<?>[] {Expression.class, Expression.class});
        ClassTestUtils.checkFieldsPrivate(Addition.class);

        ClassTestUtils.checkSuperclass(Subtraction.class, BinaryOperation.class);
        ClassTestUtils.checkConstructorImplPublic(Subtraction.class, new Class<?>[] {Expression.class, Expression.class});
        ClassTestUtils.checkFieldsPrivate(Subtraction.class);

        ClassTestUtils.checkSuperclass(Multiplication.class, BinaryOperation.class);
        ClassTestUtils.checkConstructorImplPublic(Multiplication.class, new Class<?>[] {Expression.class, Expression.class});
        ClassTestUtils.checkFieldsPrivate(Multiplication.class);

        ClassTestUtils.checkSuperclass(Division.class, BinaryOperation.class);
        ClassTestUtils.checkConstructorImplPublic(Division.class, new Class<?>[] {Expression.class, Expression.class});
        ClassTestUtils.checkFieldsPrivate(Division.class);

        ClassTestUtils.checkInterface(UnaryOperation.class, "Expression");
        ClassTestUtils.checkClassAbstract(UnaryOperation.class);

        ClassTestUtils.checkSuperclass(Minus.class, UnaryOperation.class);
        ClassTestUtils.checkConstructorImplPublic(Minus.class, new Class<?>[] {Expression.class});
        ClassTestUtils.checkFieldsPrivate(Minus.class);

        ClassTestUtils.checkSuperclass(AbsoluteValue.class, UnaryOperation.class);
        ClassTestUtils.checkConstructorImplPublic(AbsoluteValue.class, new Class<?>[] {Expression.class});
        ClassTestUtils.checkFieldsPrivate(AbsoluteValue.class);

        ClassTestUtils.checkSuperclass(SquareRoot.class, UnaryOperation.class);
        ClassTestUtils.checkConstructorImplPublic(SquareRoot.class, new Class<?>[] {Expression.class});
        ClassTestUtils.checkFieldsPrivate(SquareRoot.class);

        ClassTestUtils.checkInterface(Variable.class, "Expression");
        ClassTestUtils.checkConstructorImplPublic(Variable.class, new Class<?>[] {String.class});
        ClassTestUtils.checkFieldsPrivate(Variable.class);
    }
}
