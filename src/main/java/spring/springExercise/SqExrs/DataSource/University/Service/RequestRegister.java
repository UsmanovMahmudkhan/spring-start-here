package spring.springExercise.SqExrs.DataSource.University.Service;

import org.springframework.stereotype.Service;
import spring.springExercise.SqExrs.DataSource.University.Model.Student;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;


public class RequestRegister {
    Course course;
    Student student;

    public RequestRegister(Course course, Student student) {
        this.course = course;
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public spring.springExercise.SqExrs.DataSource.University.Model.Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
