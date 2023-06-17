package homework5;

import homework5.model.Student;
import homework5.model.StudyGroup;
import homework5.model.Subjects;
import homework5.model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import homework5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Teacher Lyuba = new Teacher("Lyubov'", "Vasil'evna", 42, Subjects.MATH);
        Student Karolina = new Student("Karolina", "Shepeleva", 25);
        Student Vasya = new Student("Vasya", "Pupkin", 27);
        Student Fedya = new Student("Fedor", "Magnit", 30);

        List<Student> list1 = new ArrayList<>(Arrays.asList(Karolina, Vasya, Fedya));

        StudyGroup group1 = controller.createGroup(list1, Lyuba);
        controller.readGroup(group1);
        System.out.println("\n------------------------------------------------\n");

        Teacher Yoda = new Teacher("Yoda", "Panteleevich", 500, Subjects.PHYSICS);
        Student Sholpan = new Student("Sholpan", "Alieva", 24);
        Student Ardak = new Student("Ardak", "Malikova", 26);
        Student Ilya = new Student("Ilya", "Koptev", 29);

        List<Student> list2 = new ArrayList<>(Arrays.asList(Sholpan, Ardak, Ilya));

        StudyGroup group2 = controller.createGroup(list2, Yoda);
        controller.readGroup(group2);
    }
}
