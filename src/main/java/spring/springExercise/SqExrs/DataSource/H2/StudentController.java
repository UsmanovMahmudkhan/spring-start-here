package spring.springExercise.SqExrs.DataSource.H2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/add")
    public void add(@RequestBody (required = false) Student student){
        studentRepo.addStudent(student);
    }

    @GetMapping("/all")
    public List<Student> all(){
        return studentRepo.allStudent();
    }

    @GetMapping("/id/{number}")
    public List<Student> getById(@PathVariable int number){
        return studentRepo.student(number);
    }
}
