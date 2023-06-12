package homework3;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double volume;
    private Long price;

    public Product(int id, String name, double volume, Long price) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    };

    public double getVolume() {
        return volume;
    };

    public Long getPrice() {
        return price;
    };

    @Override
    public int compareTo(Product o) {
        return price.compareTo(o.price);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", volume=" + volume + "l" +
                ", price=" + price + "T" +
                '}';
    }
}
