package spring.springExercise.SqExrs.RestServices.SendingObjects_AsResponseBody.DTOasJSON.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.springExercise.SqExrs.RestServices.SendingObjects_AsResponseBody.DTOasJSON.DTO.Book;
import spring.springExercise.SqExrs.RestServices.SendingObjects_AsResponseBody.DTOasJSON.DTO.Movie;
import spring.springExercise.SqExrs.RestServices.SendingObjects_AsResponseBody.DTOasJSON.DTO.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private final ArrayList<Student>students=new ArrayList<>();



    @GetMapping("/book")
    public Book getBooks(){
        var b1=new Book("Spring in action");
        return b1;
    }

    @GetMapping("/student")
    public Student student(){
        Student student=new Student("John",21,"Seoul","shikishiki@gmail.com");
        students.add(student);
        return student;
    }

    @GetMapping("/movie")
    public Movie movie(){
        return new Movie("Avengers","Joshhua","Fantastic");
    }

    @GetMapping("/student/{age}")
    public List<Student>getAll(@PathVariable int age){
        ArrayList<Student>custom=new ArrayList<>();
        for(Student student:students){
            if(student.getAge()==age) {
                custom.add(student);
            }
        }
        return custom;
    }
}
