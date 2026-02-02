package spring.springExercise.SqExrs.DataSource.University.Service;

import org.springframework.stereotype.Service;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;
import spring.springExercise.SqExrs.DataSource.University.Model.Student;
import spring.springExercise.SqExrs.DataSource.University.Repository.RegisterRepo;

@Service
public class RegistrationService {
    private final RegisterRepo registerRepo;

    public RegistrationService(RegisterRepo registerRepo) {
        this.registerRepo = registerRepo;
    }

    public void register(Student student, Course course){
        if(registerRepo.checkExist(student,course)){
            registerRepo.registerStudentToCourse(course,student);
        }

    }
}
