// Do not modify this file!

// The code below inspects the structure of a class or interface you should have
// defined for the solution of this assessment.  To this end, this code uses
// some methods defined in the file ClassTestUtils.java.  You do not need to
// fully understand the code below.

class Test99 {
    public static void main(String[] args) {
        ClassTestUtils.checkConstructorImplPublic(Cinema.class, new Class<?>[] {int[].class});

        ClassTestUtils.checkMethodImplPublic(Cinema.class, "rows", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Cinema.class, "seatsOnRow", new Class<?>[] {int.class});
        ClassTestUtils.checkMethodImplPublic(Cinema.class, "seats", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Cinema.class, "rowVacancies", new Class<?>[] {int.class});
        ClassTestUtils.checkMethodImplPublic(Cinema.class, "vacancies", new Class<?>[] {});
        ClassTestUtils.checkMethodImplPublic(Cinema.class, "book", new Class<?>[] {int.class, int.class});
        ClassTestUtils.checkMethodImplPublic(Cinema.class, "release", new Class<?>[] {int.class, int.class});
        ClassTestUtils.checkMethodImplPublic(Cinema.class, "seatMap", new Class<?>[] {});

        ClassTestUtils.checkFieldsPrivate(Cinema.class);
    }
}
