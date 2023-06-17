package homework5.model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    protected Teacher teacher;

    List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public StudyGroup(List<Student> inputList, Teacher teacher) {
        this.students = new ArrayList<>(List.copyOf(inputList));
        this.teacher = teacher;
    }
}
