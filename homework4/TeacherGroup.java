package homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup<E extends StudyGroupItem> implements Iterable<E> {
    private List<E> teacherList;

    public TeacherGroup() {
        teacherList = new ArrayList<>();
    }

    public void addTeacher(E teacher) {
        teacherList.add(teacher);
    }

    @Override
    public Iterator<E> iterator() {
        return new TeacherIterator<>(teacherList);
    }

    public void sortByName() {
        Collections.sort(teacherList, new TeacherComparatorByName<>());
    }

    public void sortByAge() {
        teacherList.sort(new TeacherComporatorByAge<>());
    }
}
