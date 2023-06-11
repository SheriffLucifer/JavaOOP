package homework3;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(int id, String name, double volume, Long price, int temperature) {
        super(id, name, volume, price);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + temperature + "C";
    }
}
