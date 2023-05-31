package homework1;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + temperature + "C";
    }
}
