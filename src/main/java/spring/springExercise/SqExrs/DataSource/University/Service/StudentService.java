package spring.springExercise.SqExrs.DataSource.University.Service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.StudentNotFound;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;
import spring.springExercise.SqExrs.DataSource.University.Model.Student;
import spring.springExercise.SqExrs.DataSource.University.Repository.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(StudentService.class);

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student>getStudents(){
        return studentRepo.getAllStudents();
    }

    public void registerStudent(Student student){
        if(studentRepo.checkExist(student)){
            studentRepo.registerStudent(student);
        }
        else {
            log.warn("Error in StudentService registiration");
            throw new StudentNotFound("Student already registered");
        }
    }

    public List<Course>getStudentCourse(Student student){
        if(studentRepo.checkExist(student)) {
            return studentRepo.getStudentCourses(student.getId());
        }
        else {
            log.warn("Unfound student id in getting courses");
            throw new StudentNotFound("Student not found in this ID");
        }
    }
}
