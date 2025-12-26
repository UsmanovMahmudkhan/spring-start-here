package spring.springExercise.SqExrs.Chapter3.Bean;

import org.springframework.stereotype.Component;

@Component("parrot5")
public class Parrot5 {
    private final String name="Kokoshka";

    public String getName() {
        return name;
    }
}
