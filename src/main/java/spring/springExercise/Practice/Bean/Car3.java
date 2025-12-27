package spring.springExercise.Practice.Bean;

public class Car3 {
    String name;

    public Car3() {
    }

    public Car3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car3{" +
                "name='" + name + '\'' +
                '}';
    }
}
