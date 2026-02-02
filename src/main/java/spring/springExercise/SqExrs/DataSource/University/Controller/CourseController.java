package spring.springExercise.SqExrs.DataSource.University.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.AlreadyRegisteredException;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.CourseNotFound;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;
import spring.springExercise.SqExrs.DataSource.University.Model.Student;
import spring.springExercise.SqExrs.DataSource.University.Service.CourseService;

import java.util.List;

@RestController
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/post/course")
    public ResponseEntity<String>postCourse(@RequestBody Course course) throws AlreadyRegisteredException {
        courseService.publishCourse(course);
        return ResponseEntity.ok("Succesfully registered");
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>>getAll(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(courseService.getCourses());
    }

    @GetMapping("/courses/student")
    public ResponseEntity<List<Student>>getAllStudents(@RequestBody Course course) throws CourseNotFound {
        return ResponseEntity.ok(courseService.getStudentsForClass(course));
    }
}
