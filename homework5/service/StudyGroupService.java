package homework5.service;

import java.util.List;

import homework5.model.Student;
import homework5.model.StudyGroup;
import homework5.model.Teacher;

public class StudyGroupService {
    public StudyGroup createGroup(List<Student> inputList, Teacher teacher) {
        return new StudyGroup(inputList, teacher);
    }

    public void readGroup(StudyGroup group) {
        System.out.println(group.getTeacher());
        for (int i = 0; i < group.getStudents().size(); i++) {
            System.out.println(group.getStudents().get(i));
        }
    }

    public StudyGroup addStudentToGroup(StudyGroup group, Student student) {
        group.getStudents().add(student);
        return group;
    }

}
