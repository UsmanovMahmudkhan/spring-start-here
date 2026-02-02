package spring.springExercise.SqExrs.DataSource.University.Repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;
import spring.springExercise.SqExrs.DataSource.University.Model.Registration;
import spring.springExercise.SqExrs.DataSource.University.Model.Student;

import java.util.List;

@Repository
public class RegisterRepo {

    private final JdbcTemplate template;

    public RegisterRepo(JdbcTemplate template) {
        this.template = template;
    }

    public void registerStudentToCourse(Course course, Student student){
        String query="INSERT INTO registrations(student_id,course_id) VALUES(?,?)";
        template.update(query,student.getId(),course.getId());
    }


    public boolean checkExist(Student student, Course course) {
        String query="select * from registrations where student_id = ? and course_id = ? limit 1";

        RowMapper<Registration>registrationRowMapper=(rs,index)->{
            Registration registration=new Registration();
            registration.setId(rs.getBigDecimal("id"));
            registration.setCourse_id(rs.getBigDecimal("course_id"));
            registration.setStudent_id(rs.getBigDecimal("student_id"));
            registration.setRegistered_at(rs.getTimestamp("registered_at"));
            return registration;
        };

        List<Registration>registrations=template.query(query,registrationRowMapper,student.getId(),course.getId());

        if(registrations.isEmpty()){
            return false;
        }
        return true;

    }
}
