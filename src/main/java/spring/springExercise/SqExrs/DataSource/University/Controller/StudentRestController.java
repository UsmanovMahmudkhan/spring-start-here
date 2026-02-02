package spring.springExercise.SqExrs.DataSource.University.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.StudentNotFound;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;
import spring.springExercise.SqExrs.DataSource.University.Model.Student;
import spring.springExercise.SqExrs.DataSource.University.Service.StudentService;

import java.util.List;

@RestController
public class StudentRestController {
    private final StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add/students")
    public void postStudent(@RequestBody Student student) throws StudentNotFound {
        studentService.registerStudent(student);
    }

    @GetMapping("/all/students")
    public ResponseEntity<List<Student>>allStudents(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(studentService.getStudents());
    }

    @GetMapping("/student/courses")
    public ResponseEntity<List<Course>>getCourse(@RequestBody Student student){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(studentService.getStudentCourse(student));
    }

}
