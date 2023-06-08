package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudentGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

    public void sortByName() {
        Collections.sort(studentList, new StudentComparatorByName());
    }

    public void sortByAge() {
        studentList.sort(new StudentComporatorByAge());
    }
}
