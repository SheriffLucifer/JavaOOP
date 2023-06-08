package lesson3;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.addStudent("Maria", 18);
        service.addStudent("Daria", 30);
        service.addStudent("Pavel", 20);
        service.addStudent("Sasha", 22);
        service.addStudent("Vasya", 25);

        System.out.println(service.getInfo());

        service.sortByName();
        System.out.println(service.getInfo());

        service.sortByAge();
        System.out.println(service.getInfo());
    }
}
