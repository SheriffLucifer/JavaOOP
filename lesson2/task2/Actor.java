package lesson2.task2;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
        this.isMakeOrder = false;
        this.isTakeOrder = false;
    }

    public String getName() {
        return name;
    };
}
