package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.MultifieldSessionObject;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class StudentSession {

    private String name;
    private String major;
    private int year;

    public StudentSession() {
    }

    public StudentSession(String name, String major, int year) {
        this.name = name;
        this.major = major;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "StudentSession{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", year=" + year +
                '}';
    }
}

