package spring.springExercise.SqExrs.Chapter6.AnnotationInterceptedMethods;

public class Comment {
    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Comment(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                '}';
    }
}
