package homework1;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();

        Product coffee = new HotDrink("Coffee", 0.15, 60);
        Product tea = new HotDrink("Tea", 0.2, 60);
        Product milkTea = new HotDrink("Tea with milk", 0.2, 50);
        LinkedList<Product> l = new LinkedList<>();
        l.add(coffee);
        l.add(tea);
        l.add(milkTea);

        vendingMachine.putProduct(l);
        vendingMachine.putProduct(l);
        vendingMachine.putProduct(l);

        System.out.println(vendingMachine.getProduct());
        System.out.println(vendingMachine.getProduct());
        System.out.println(vendingMachine.getProduct());
    }
}
