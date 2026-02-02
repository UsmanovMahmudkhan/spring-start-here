package spring.springExercise.SqExrs.DataSource.University.Controller;

import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.RegisteredExceptions;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;
import spring.springExercise.SqExrs.DataSource.University.Model.Registration;
import spring.springExercise.SqExrs.DataSource.University.Model.Student;
import spring.springExercise.SqExrs.DataSource.University.Service.RegistrationService;
import spring.springExercise.SqExrs.DataSource.University.Service.RequestRegister;


@RestController
public class RegistrationController {

    private final RegistrationService service;

    public RegistrationController(RegistrationService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<String>register(@RequestBody RequestRegister requestRegister) throws RegisteredExceptions {
        service.register(requestRegister.getStudent(), requestRegister.getCourse());
       return ResponseEntity.ok("Succcesfully Created");
    }


}
