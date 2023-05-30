package lesson2.task3;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Robert");

        Human human2 = new Human("Douny");

        Human human3 = new Human("Junior");

        Human human4 = new Human("Stark");

        Market market = new Market();

        market.acceptToMarket(human);

        market.acceptToMarket(human2);

        market.acceptToMarket(human3);

        market.acceptToMarket(human4);

        market.update();

    }

}
