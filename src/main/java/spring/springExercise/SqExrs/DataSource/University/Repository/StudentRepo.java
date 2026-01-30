package spring.springExercise.SqExrs.DataSource.University.Repository;

import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import spring.springExercise.SqExrs.DataSource.University.Model.Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class StudentRepo {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(StudentRepo.class);
    private final Logger logger=Logger.getLogger(StudentRepo.class.getName());

    private final JdbcTemplate jdbcTemplate;

    public StudentRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void registerStudent(Student student){
        String query="INSERT INTO students(student_number,name,email) VALUES(?,?,?)";
        jdbcTemplate.update(query,student.getStudent_number(),student.getName(),student.getEmail());
        log.info("Student table updated: "+student);
    }

    public List<Student>getByNumber(String student_number){
        String query="SELECT * FROM students where student_number=?";
        RowMapper<Student>rowMapper=(rs,index)
        ->{
            Student student=new Student();
            student.setId(rs.getBigDecimal("id"));
            student.setStudent_number(rs.getString("student_number"));
            student.setName(rs.getString("name"));
            student.setEmail(rs.getString("email"));
            return student;
        };

        return jdbcTemplate.query(query,rowMapper,student_number);
    }
}
