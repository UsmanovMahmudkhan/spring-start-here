package spring.springExercise.SqExrs.Chapter6.NO_Aspects;

public class Comment {
    String text;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Comment(String text, int age) {
        this.text = text;
        this.age = age;
    }
}
