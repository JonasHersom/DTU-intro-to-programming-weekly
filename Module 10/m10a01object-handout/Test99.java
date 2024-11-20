// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkSuperclass(MehPoint3D.class, UglyPoint3D.class);
        ClassTestUtils.checkSuperclass(OkPoint3D.class, MehPoint3D.class);
        ClassTestUtils.checkSuperclass(GoodPoint3D.class, OkPoint3D.class);
        ClassTestUtils.checkSuperclass(ExcellentPoint3D.class, GoodPoint3D.class);
    }
}
