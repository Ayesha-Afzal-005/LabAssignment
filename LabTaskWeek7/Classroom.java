class ClassRoom {
    private String className;
    private String classCode;
    private Teacher teacher;
    private Student[] students;
    private int studentCount = 0;

    public ClassRoom(String className, String classCode, Teacher teacher) {
        this.className = className;
        this.classCode = classCode;
        this.teacher = teacher;
        this.students = new Student[5]; 
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append("Class: ").append(className).append(" (").append(classCode).append(")\n");
        details.append("Teacher: ").append(teacher).append("\nStudents:\n");
        for (int i = 0; i < studentCount; i++) {
            details.append("  ").append(students[i]).append("\n");
        }
        return details.toString();
    }
}
