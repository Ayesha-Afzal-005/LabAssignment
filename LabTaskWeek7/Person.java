class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
class Principal extends Person {
    private int experienceYears;

    public Principal(String name, int age, int experienceYears) {
        super(name, age);
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return super.toString() + ", Experience: " + experienceYears + " years";
    }
}
class Teacher extends Person {
    private String subject;
    private int teacherID;

    public Teacher(String name, int age, String subject, int teacherID) {
        super(name, age);
        this.subject = subject;
        this.teacherID = teacherID;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Teacher)) return false;
        Teacher other = (Teacher) obj;
        return this.teacherID == other.teacherID;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Teacher ID: " + teacherID;
    }
}
class Student extends Person {
    private int rollNo;

    public Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.rollNo == other.rollNo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Roll No: " + rollNo;
    }
}
