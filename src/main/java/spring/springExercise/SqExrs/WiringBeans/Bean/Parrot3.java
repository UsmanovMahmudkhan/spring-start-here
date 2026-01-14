package spring.springExercise.SqExrs.WiringBeans.Bean;

public class Parrot3 {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot 3 " +
                "name='" + name + '\'';
    }
}
