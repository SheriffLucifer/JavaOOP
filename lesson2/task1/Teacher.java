package lesson2.task1;

public class Teacher extends Human implements AdditionalWork, PlaceOfLiving {
    private boolean job;
    private String city;

    public Teacher(String name, String lastName, int age, Boolean job, String city) {
        super(name, lastName, age);
        this.job = job;
        this.city = city;
    }

    public void tellInfo() {
        System.out.println("Privet! my name " + name + " " + lastName + " im " + age
                + " and im teacher ");

    }

    @Override
    public boolean isWorking() {
        return job;
    }

    @Override
    public String getPlaceOfLiving() {
        return city;
    }
}