package homework5.model;

public class Teacher extends Person {
    static int idGenerator = 0;
    private Subjects subjectTeach;
    private int teacherId;

    public Subjects getSubjectTeach() {
        return subjectTeach;
    }

    public int getTeachertId() {
        return teacherId;
    }

    public Teacher(String name, String lastName, int age, Subjects subject) {
        super(name, lastName, age);
        this.subjectTeach = subject;
        this.teacherId = idGenerator++;
    }

    @Override
    public String toString() {
        return "ID учителя = " + teacherId + " " + super.toString() + ", предмет = " + subjectTeach + " }";
    }
}
