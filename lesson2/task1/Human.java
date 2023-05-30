package lesson2.task1;

public abstract class Human {
    protected String name;
    protected String lastName;
    protected int age;

    public Human() {
    }

    public Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public abstract void tellInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}