package spring.springExercise.SqExrs.DataSource.University.Repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;
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
        String query="select 1\n" +
                "from registrations\n" +
                "where student_id = ?\n" +
                "and course_id = ?\n" +
                "limit 1";
    }
}
