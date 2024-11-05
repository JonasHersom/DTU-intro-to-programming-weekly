// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkInterface(Constant.class, "Expression");
        ClassTestUtils.checkConstructorImplPublic(Constant.class, new Class<?>[] {double.class});
        ClassTestUtils.checkFieldsPrivate(Constant.class);

        ClassTestUtils.checkInterface(Addition.class, "Expression");
        ClassTestUtils.checkConstructorImplPublic(Addition.class, new Class<?>[] {Expression.class, Expression.class});
        ClassTestUtils.checkFieldsPrivate(Addition.class);

        ClassTestUtils.checkInterface(Subtraction.class, "Expression");
        ClassTestUtils.checkConstructorImplPublic(Subtraction.class, new Class<?>[] {Expression.class, Expression.class});
        ClassTestUtils.checkFieldsPrivate(Subtraction.class);

        ClassTestUtils.checkInterface(Multiplication.class, "Expression");
        ClassTestUtils.checkConstructorImplPublic(Multiplication.class, new Class<?>[] {Expression.class, Expression.class});
        ClassTestUtils.checkFieldsPrivate(Multiplication.class);

        ClassTestUtils.checkInterface(Division.class, "Expression");
        ClassTestUtils.checkConstructorImplPublic(Division.class, new Class<?>[] {Expression.class, Expression.class});
        ClassTestUtils.checkFieldsPrivate(Division.class);
    }
}
