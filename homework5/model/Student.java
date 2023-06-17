package homework5.model;

public class Student extends Person {
    static int idGenerator = 0;
    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public Student(String name, String lastName, int age) {
        super(name, lastName, age);
        this.studentId = idGenerator++;
    }

    @Override
    public String toString() {
        return "ID студента = " + studentId + " " + super.toString() + " }";
    }
}
