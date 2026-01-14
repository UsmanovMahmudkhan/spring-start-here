package spring.springExercise.SqExrs.WiringBeans.Bean;


public class Parrot {
    String name;

    public String getName() {
        return name;
    }

    public Parrot(String name) {
        this.name = name;
    }

    public Parrot() {
    }

    public void setName(String name) {
        this.name = name;
    }
}
