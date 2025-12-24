package spring.springExercise.SqExrs.Chapter3.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personbek")
public class Person4 {
    String name="alexe";

    @Autowired
    public Parrot4 parrot4;

    public String getName() {
        return name;
    }
}
