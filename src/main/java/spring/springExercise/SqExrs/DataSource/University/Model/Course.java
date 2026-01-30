package spring.springExercise.SqExrs.DataSource.University.Model;

import java.math.BigDecimal;

public class Course {
    private BigDecimal id;
    private String code;
    private String title;
    private int credit;

    public Course() {
    }

    public Course(BigDecimal id, String code, String title, int credit) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.credit = credit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", credit=" + credit +
                '}';
    }
}
