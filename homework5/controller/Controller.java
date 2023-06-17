package homework5.controller;

import java.util.List;

import homework5.model.Student;
import homework5.model.StudyGroup;
import homework5.model.Teacher;
import homework5.service.DataService;
import homework5.service.StudyGroupService;

public class Controller {
    private DataService dataService = new DataService();
    private StudyGroupService studyGroupService = new StudyGroupService();

    public StudyGroup createGroup(List<Student> inputList, Teacher teacher) {
        return studyGroupService.createGroup(inputList, teacher);
    }

    public void readGroup(StudyGroup group) {
        studyGroupService.readGroup(group);
    }

    public StudyGroup addStudentToGroup(StudyGroup group, Student student) {
        return studyGroupService.addStudentToGroup(group, student);
    }

    public void create(List<Student> inputList, Teacher teacher) {
        if (inputList != null && teacher != null) {
            dataService.create(inputList, teacher);
        } else {
            System.out.println("Wrong data!");
        }
    }

    public void create(Student inputStudent) {
        dataService.create(inputStudent);
    }

    public void read() {
        dataService.read();
    }
}
