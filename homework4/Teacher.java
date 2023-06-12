package homework4;

public class Teacher implements Comparable<Teacher>, StudyGroupItem {
    private int id;
    private String name;
    private int age;

    public Teacher(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Teacher o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
