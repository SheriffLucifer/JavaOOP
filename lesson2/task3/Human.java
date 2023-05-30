package lesson2.task3;

public class Human extends Actor implements ActorBehavior {

    public Human(String name) {

        super(name);

    }

    @Override

    public void setMakeOrder() {

        isMakeOrder = true;

    }

    @Override

    public void setTakeOrder() {

        isTakeOrder = true;

    }

    @Override

    public boolean isMakeOrder() {

        return isMakeOrder;

    }

    @Override

    public boolean isTakeOrder() {

        return isTakeOrder;

    }

}
