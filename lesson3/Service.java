package lesson3;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private int id;
    private StudentGroup activeGroup;
    private List<StudentGroup> studentGroupList;

    public Service(StudentGroup group) {
        this.activeGroup = group;
        studentGroupList = new ArrayList<>();
        studentGroupList.add(group);
        id = 0;
    }

    public Service() {
        this(new StudentGroup());
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    public void addStudent(String name, int age) {
        activeGroup.addStudent(new Student(id++, name, age));
    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Student student : activeGroup) {
            stringBuilder.append(student).append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName() {
        activeGroup.sortByName();
    }

    public void sortByAge() {
        activeGroup.sortByAge();
    }
}
