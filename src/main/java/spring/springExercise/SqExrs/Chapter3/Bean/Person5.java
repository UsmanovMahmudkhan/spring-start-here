package spring.springExercise.SqExrs.Chapter3.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("person5")
public class Person5 {
    private final String name="Huzuxon";

    public final Parrot5 p5;

    @Autowired
    public Person5(Parrot5 p5) {
        this.p5 = p5;
    }

    public String getName() {
        return name;
    }
}
