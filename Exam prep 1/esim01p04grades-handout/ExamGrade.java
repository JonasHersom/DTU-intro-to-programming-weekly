class ExamGrade {
    private String studentId;
    private String grade;

    public ExamGrade(String studentId, String grade) {
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
