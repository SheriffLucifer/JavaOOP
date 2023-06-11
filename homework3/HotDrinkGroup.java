package homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HotDrinkGroup implements Iterable<HotDrink> {
    private List<HotDrink> hotDrinkList;

    public HotDrinkGroup() {
        hotDrinkList = new ArrayList<>();
    }

    public void addHotDrink(HotDrink hotDrink) {
        hotDrinkList.add(hotDrink);
    }

    @Override
    public Iterator<HotDrink> iterator() {
        return new HotDrinkIterator(hotDrinkList);
    }

    public void sortByPrice() {
        hotDrinkList.sort(new HotDrinkComporatorByPrice());
    }
}
