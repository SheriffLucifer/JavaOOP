package lesson2.task2;

public class Main {
    public static void main(String[] args) {
        Human h = new Human("Ivan");
        System.out.println(h.getName());
        h.setTakeOrder();
        System.out.println(h.isTakeOrder);
        h.setMakeOrder();
        System.out.println(h.isMakeOrder());

    }
}
