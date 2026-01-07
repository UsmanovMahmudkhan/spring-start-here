package spring.springExercise.SqExrs.Chapter6.Aspects;

import org.springframework.stereotype.Component;


public class Comment {
    String text;

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
