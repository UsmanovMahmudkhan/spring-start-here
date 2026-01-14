package spring.springExercise.SqExrs.WiringBeans.Bean;

import org.springframework.stereotype.Component;

@Component("parrot5")
public class Parrot5 {
    private final String name="Kokoshka";

    public String getName() {
        return name;
    }
}
