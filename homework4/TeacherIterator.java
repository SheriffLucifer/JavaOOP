package homework4;

import java.util.Iterator;
import java.util.List;

public class TeacherIterator<E> implements Iterator<E> {
    private int index;
    private List<E> teacherList;

    public TeacherIterator(List<E> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public boolean hasNext() {
        return index < teacherList.size();
    }

    @Override
    public E next() {
        return teacherList.get(index++);
    }
}
