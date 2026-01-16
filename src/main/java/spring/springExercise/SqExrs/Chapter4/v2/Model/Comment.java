package spring.springExercise.SqExrs.Chapter4.v2.Model;

public class Comment {
    String text;
    String owner;

    public Comment(String text, String owner) {
        this.text = text;
        this.owner = owner;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
