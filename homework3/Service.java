package homework3;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private int id;
    private HotDrinkGroup activeGroup;
    private List<HotDrinkGroup> hotDrinkGroupList;

    public Service(HotDrinkGroup group) {
        this.activeGroup = group;
        hotDrinkGroupList = new ArrayList<>();
        hotDrinkGroupList.add(group);
        id = 0;
    }

    public Service() {
        this(new HotDrinkGroup());
    }

    public void addHotDrinkGroup(HotDrinkGroup hotDrinkGroup) {
        hotDrinkGroupList.add(hotDrinkGroup);
    }

    public void addHotDrink(String name, double volume, Long price, int temperature) {
        activeGroup.addHotDrink(new HotDrink(id++, name, volume, price, temperature));
    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (HotDrink hotDrink : activeGroup) {
            stringBuilder.append(hotDrink).append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByPrice() {
        activeGroup.sortByPrice();
    }
}
