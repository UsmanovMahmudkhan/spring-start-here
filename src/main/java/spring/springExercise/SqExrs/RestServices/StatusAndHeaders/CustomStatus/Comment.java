package spring.springExercise.SqExrs.RestServices.StatusAndHeaders.CustomStatus;

public class Comment {
    String text;

    public Comment(String text) {
        this.text = text;
    }

    public Comment() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
