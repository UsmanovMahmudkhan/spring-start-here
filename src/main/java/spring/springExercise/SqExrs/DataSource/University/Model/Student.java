package spring.springExercise.SqExrs.DataSource.University.Model;

import java.math.BigDecimal;

public class Student {

    private BigDecimal id;
    private String student_number;
    private String name;
    private String email;

    public Student() {
    }

    public Student(BigDecimal id, String student_number, String name, String email) {
        this.id = id;
        this.student_number = student_number;
        this.name = name;
        this.email = email;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", student_number='" + student_number + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
