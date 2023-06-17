package homework5.service;

import java.util.List;

import homework5.model.Student;
import homework5.model.Teacher;

public interface Service {
    public void create(List<Student> inputList, Teacher teacher);

    public void create(Student inputStudent);

    public void read();
}
