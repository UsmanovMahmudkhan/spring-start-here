package spring.springExercise.SqExrs.Chapter3.Bean;

import org.springframework.stereotype.Component;

@Component
public class Parrot4 {
    String name="parrotoy";

    public Parrot4() {
        System.out.println("Parrot4 is created here");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot4{" +
                "name='" + name + '\'' +
                '}';
    }
}
