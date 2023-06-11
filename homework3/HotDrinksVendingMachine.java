package homework3;

import java.util.LinkedList;

public class HotDrinksVendingMachine implements VendingMachine {
    private LinkedList<Product> drinks;

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.drinks = item;
    }

    @Override
    public Product getProduct() {
        return drinks.pollLast();
    }
}
