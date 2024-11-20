// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Date.class, new Class<?>[] {int.class, int.class, int.class});

        var fieldNames = new String[] { "year", "month", "day" };
        for (var f: fieldNames) {
            ClassTestUtils.checkFieldImplPublic(Date.class, f);
        }
    }
}
