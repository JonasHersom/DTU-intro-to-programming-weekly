class ExamGrade {
    private String studentId;
    private String grade;

    public ExamGrade(String studentId, String grade) {
        studentIdValid(studentId);
        this.studentId = studentId;
        gradeValid(grade);
        this.grade = grade;
    }

    public static void studentIdValid(String studentId) {
        String printError = "Invalid student id: '" + studentId + "'";
        if (studentId == null) throw new IllegalArgumentException (printError);
        if (studentId.length() != 7) throw new IllegalArgumentException (printError);
        if (studentId.charAt(0) != 's') throw new IllegalArgumentException (printError);
        for (int i = 1; i < 7; i++) {
            if (!isDigit(studentId.charAt(i))) throw new IllegalArgumentException (printError);
        }
    }

    public static void gradeValid(String grade) {
        String printError = "Invalid grade: '" + grade + "'";
        if (grade == null) throw new IllegalArgumentException (printError);
        if (grade.length() != 1 && grade.length() != 2) throw new IllegalArgumentException (printError);
        if (!grade.equals("-3") && 
            !grade.equals("00") && 
            !grade.equals("02") && 
            !grade.equals("4") && 
            !grade.equals("7") && 
            !grade.equals("10") && 
            !grade.equals("12") 
        ) throw new IllegalArgumentException (printError);
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        studentIdValid(studentId);
        this.studentId = studentId;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        gradeValid(grade);
        this.grade = grade;
    }

    // The following two functions are identical to the ones provided in 11-07 Contacts.
    private static boolean isDigit(char c) {
        return ((c >= '0') && (c <= '9'));
    } 

    private static boolean isLetter(char c) {
        return (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')));
    }
}
