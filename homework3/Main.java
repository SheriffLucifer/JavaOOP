package homework3;

public class Main {

    public static void main(String[] args) {

        // HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine();
        // HotDrink coffee = new HotDrink(0, "Coffee", 0.25, 950l, 70);
        // HotDrink tea = new HotDrink(1, "Tea", 0.25, 300l, 60);
        // HotDrink milkTea = new HotDrink(2, "Coffee", 0.5, 1500l, 70);

        // LinkedList<Product> list = new LinkedList<>();
        // list.add(coffee);
        // list.add(tea);
        // list.add(milkTea);

        // vendingMachine.putProduct(list);
        // vendingMachine.putProduct(list);
        // vendingMachine.putProduct(list);

        // System.out.println(vendingMachine.getProduct());
        // System.out.println(vendingMachine.getProduct());
        // System.out.println(vendingMachine.getProduct());

        Service service = new Service();
        service.addHotDrink("Coffee", 0.25, 950l, 70);
        service.addHotDrink("Tea", 0.25, 500l, 60);
        service.addHotDrink("Tea with milk", 0.25, 600l, 60);
        service.addHotDrink("Coffee", 0.35, 1050l, 70);
        service.addHotDrink("Coffee", 0.5, 1300l, 70);
        service.addHotDrink("Latte", 0.5, 1200l, 70);
        service.addHotDrink("Capuccino", 0.25, 1000l, 70);

        System.out.println(service.getInfo());

        service.sortByPrice();
        System.out.println(service.getInfo());

    }
}
