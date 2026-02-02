package spring.springExercise.SqExrs.DataSource.University.Model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Registration {
    private BigDecimal id;
    private BigDecimal student_id;
    private BigDecimal course_id;
    private Timestamp registered_at = new Timestamp(System.currentTimeMillis());

    public Registration() {
    }

    public Registration(BigDecimal id, BigDecimal student_id, BigDecimal course_id, Timestamp registered_at) {
        this.id = id;
        this.student_id = student_id;
        this.course_id = course_id;
        this.registered_at = registered_at;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getStudent_id() {
        return student_id;
    }

    public void setStudent_id(BigDecimal student_id) {
        this.student_id = student_id;
    }

    public BigDecimal getCourse_id() {
        return course_id;
    }

    public void setCourse_id(BigDecimal course_id) {
        this.course_id = course_id;
    }

    public Timestamp getRegistered_at() {
        return registered_at;
    }

    public void setRegistered_at(Timestamp registered_at) {
        this.registered_at = registered_at;
    }
}
