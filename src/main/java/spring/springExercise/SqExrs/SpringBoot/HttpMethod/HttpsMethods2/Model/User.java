package spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods2.Model;

public class User {

    private String name;
    private int age;
    Comment comment;

    public User(String name, int age, Comment comment) {
        this.name = name;
        this.age = age;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", comment=" + comment +
                '}';
    }
}
