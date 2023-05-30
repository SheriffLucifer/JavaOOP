package lesson2.task3;

public interface QueueBahavior {

    void takeQueue(Human human);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

}