package homework5.service;

import java.util.ArrayList;
import java.util.List;

import homework5.model.Student;
import homework5.model.Teacher;

public class DataService implements Service {
    static int idGenerator;
    List<Student> students;
    Teacher teacher;

    public DataService() {
        this.students = new ArrayList<>();
    }

    @Override
    public void create(List<Student> inputList, Teacher teacher) {
        this.students.addAll(inputList);
        this.teacher = teacher;
    }

    @Override
    public void create(Student inputStudent) {
        this.students.add(inputStudent);
    }

    @Override
    public void read() {
        System.out.println(this.teacher);
        for (Student s : students) {
            System.out.println("\t" + s.toString());
        }
    }
}
