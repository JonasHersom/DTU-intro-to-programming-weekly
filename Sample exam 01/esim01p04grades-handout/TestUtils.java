// Do not modify this file!

class TestUtils {
    public static void tryCreateExamGrades(String[][] studentIdsGrades) {
        for (var studentIdGrade: studentIdsGrades) {
            var studentId = studentIdGrade[0];
            var grade = studentIdGrade[1];

            System.out.println("Creating new ExamGrade with student id '"
                               + studentId + "' and grade '" + grade + "'...");
            try {
                var eg = new ExamGrade(studentId, grade);
                System.out.println("    - OK: id = '" + eg.getStudentId()
                                   + "', grade = '" + eg.getGrade() + "'");
            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed! " + e.getMessage());
            }
        }
    }

    public static void trySetStudentIds(String[] studentIds) {
        System.out.println("Creating new ExamGrade with student 's123456' and grade '12'");
        var eg = new ExamGrade("s123456", "12");
        for (var studentId: studentIds) {
            System.out.println("Setting the student id to '" + studentId + "'...");
            try {
                eg.setStudentId(studentId);
                System.out.println("    - OK");
            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed! " + e.getMessage());
            }
            System.out.println("    - The ExamGrade object now has: "
                               + "id = '" + eg.getStudentId()
                               + "', grade = '" + eg.getGrade() + "'");
        }
    }

    public static void trySetGrades(String[] grades) {
        System.out.println("Creating new ExamGrade with student 's123456' and grade '12'");
        var eg = new ExamGrade("s123456", "12");
        for (var grade: grades) {
            System.out.println("Setting the grade to '" + grade + "'...");
            try {
                eg.setGrade(grade);
                System.out.println("    - OK");
            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed! " + e.getMessage());
            }
            System.out.println("    - The ExamGrade object now has: "
                               + "id = '" + eg.getStudentId()
                               + "', grade = '" + eg.getGrade() + "'");
        }
    }
}
