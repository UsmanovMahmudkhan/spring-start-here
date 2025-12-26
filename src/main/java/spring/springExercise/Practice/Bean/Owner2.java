package spring.springExercise.Practice.Bean;

public class Owner2 {
    String name;
    Car2 car2;

    public Owner2(String name,Car2 car2) {
        this.name = name;
        this.car2=car2;
    }

    public Owner2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car2 getCar2() {
        return car2;
    }

    public void setCar2(Car2 car2) {
        this.car2 = car2;
    }
}
