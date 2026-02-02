package spring.springExercise.SqExrs.DataSource.University.Service;

import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.AlreadyRegisteredException;
import spring.springExercise.SqExrs.DataSource.University.Exceptions.CourseNotFound;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;
import spring.springExercise.SqExrs.DataSource.University.Model.Student;
import spring.springExercise.SqExrs.DataSource.University.Repository.CourseRepo;

import java.util.List;

@Service
public class CourseService {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(CourseService.class);
    private final CourseRepo courseRepo;

    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public void publishCourse(Course course) throws AlreadyRegisteredException {
       if(!courseRepo.findByID(course.getId())){
           courseRepo.registerCourse(course);
       }else {
           log.error("Course is registered already");
           throw new AlreadyRegisteredException("This course is already registered!!!!");

       }
    }

    public List<Course>getCourses(){
        return courseRepo.getAllCourse();
    }

    //private BigDecimal id;
    //    private String student_number;
    //    private String name;
    //    private String email

    public List<Student>getStudentsForClass(Course course) throws CourseNotFound {
        if(courseRepo.findByID(course.getId())){
            return courseRepo.getStudentsForOneCourse(course);
        }
        else {
            throw new CourseNotFound("Course Id is not found");
        }

    }


}
