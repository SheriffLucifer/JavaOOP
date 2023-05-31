package homework1;

public class Product {

    private String name;
    private double volume;

    public Product(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    };

    public double getVolume() {
        return volume;
    };

    @Override
    public String toString() {
        return name + " - " + volume + "l";
    }
}
