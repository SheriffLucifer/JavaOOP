package homework3;

import java.util.Iterator;
import java.util.List;

public class HotDrinkIterator implements Iterator<HotDrink> {
    private int index;
    private List<HotDrink> hotDrinkList;

    public HotDrinkIterator(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    @Override
    public boolean hasNext() {
        return index < hotDrinkList.size();
    }

    @Override
    public HotDrink next() {
        return hotDrinkList.get(index++);
    }
}
