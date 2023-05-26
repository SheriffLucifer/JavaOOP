package lesson1;

import java.util.LinkedList;

public class Main {
    /*
     * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
     * содержащий в себе методы initProducts (List <Product>) сохраняющий в
     * себе список исходных продуктов и getProduct(String name)
     */

    public static void main(String[] args) {
        WaterVendingMachine wvm = new WaterVendingMachine();

        Product bonAqua = new BottleOfWater("bonAqua", 50);
        Product redKey = new BottleOfWater("redKey", 60);
        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);

        wvm.putProduct(l);

        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
    }
}
