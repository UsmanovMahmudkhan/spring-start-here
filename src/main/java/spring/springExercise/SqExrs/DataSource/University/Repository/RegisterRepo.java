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

    public List<Student>getAllStudent(String courseCode){
        String query="SELECT s.id, s.student_number, s.name, s.email FROM students s INNER JOIN registrations r ON s.id = r.student_id INNER JOIN courses c ON r.course_id = c.id WHERE c.code=?";
        RowMapper<Student>studentRowMapper=(rs,index)
        ->{
            Student s=new Student();
            s.setId(rs.getBigDecimal("id"));
            s.setStudent_number(rs.getString("student_number"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            return s;
        };

        return template.query(query,studentRowMapper,courseCode);
    }


}
