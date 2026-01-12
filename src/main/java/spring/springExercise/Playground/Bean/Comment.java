package spring.springExercise.Playground.Bean;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Comment {
    String contex;

    public Comment(String contex) {
        this.contex = contex;
    }

    public String getContex() {
        return contex;
    }

    public void setContex(String contex) {
        this.contex = contex;
    }

    @PostConstruct
    public void giveName(){
        setContex("MahmudKhan");
    }
}
