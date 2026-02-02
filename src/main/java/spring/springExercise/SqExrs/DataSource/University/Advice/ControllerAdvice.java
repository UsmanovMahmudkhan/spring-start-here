package spring.springExercise.SqExrs.DataSource.University.Advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.AlreadyRegisteredException;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.CourseNotFound;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.RegisteredExceptions;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.StudentNotFound;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(AlreadyRegisteredException.class)
    public ResponseEntity<String>registerException(){
        return ResponseEntity.badRequest().body("Already Registered");
    }

    @ExceptionHandler(CourseNotFound.class)
    public ResponseEntity<String>courseException(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<String>studentException(){
        return ResponseEntity.badRequest().body("Student not found");
    }

    @ExceptionHandler(RegisteredExceptions.class)
    public ResponseEntity<String>registerExceptionForCourse(){
        return ResponseEntity.badRequest().body("Smth wrong happened in Registration or not found");
    }
}
