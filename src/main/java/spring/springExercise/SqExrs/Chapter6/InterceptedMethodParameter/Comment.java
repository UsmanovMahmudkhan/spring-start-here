package spring.springExercise.SqExrs.Chapter6.InterceptedMethodParameter;


public class Comment {

    String text;

    public String getText() {
        return text;
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
