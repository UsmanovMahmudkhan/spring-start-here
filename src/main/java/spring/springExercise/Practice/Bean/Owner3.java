package spring.springExercise.Practice.Bean;

public class Owner3 {
    String name;

    @Override
    public String toString() {
        return "Owner3{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner3(String name) {
        this.name = name;
    }

    public Owner3() {
    }
}
