package spring.springExercise.SqExrs.DataSource.University.Repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;
import spring.springExercise.SqExrs.DataSource.University.Model.Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class CourseRepo {

    private final Logger log=Logger.getLogger(CourseRepo.class.getName());

    private final JdbcTemplate jdbcTemplate;

    public CourseRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void registerCourse(Course course){
        String query="INSERT INTO courses(code,title,credit) VALUES(?,?,?)";
        jdbcTemplate.update(query,course.getCode(),course.getTitle(),course.getCredit());
        log.info("New Values are added in Course: "+course);
    }

    public List<Course>getAllCourse(){
        String query="SELECT * FROM courses";
        RowMapper<Course>rowMapper=(rs,index)
        ->{
            Course course=new Course();
            course.setId(rs.getBigDecimal("id"));
            course.setCode(rs.getString("code"));
            course.setTitle(rs.getString("title"));
            course.setCredit(rs.getInt("credit"));
            return course;
        };

        return jdbcTemplate.query(query,rowMapper);
    }

    public boolean findByID(BigDecimal id){
        String query="SELECT * FROM course where id=?";
        RowMapper<Course>rowMapper=(rs,inx)->
        {
            Course c=new Course();
            c.setId(rs.getBigDecimal("id"));
            c.setCredit(rs.getInt("credit"));
            c.setCode(rs.getString("code"));
            c.setTitle(rs.getString("title"));
            return c;
        };

        List<Course>courses=jdbcTemplate.query(query,rowMapper,id);
        if(courses.isEmpty()){
            return false;
        }
            return true;

    }

    public List<Student>getStudentsForOneCourse(Course course){
        String query="SELECT s.id, s.student_number, s.name, s.email\n" +
                "FROM students s\n" +
                "JOIN registrations r ON r.student_id = s.id\n" +
                "WHERE r.course_id = 1;=?";

        RowMapper<Student>rowMapper=(rs,index)
                ->{
            Student student=new Student();
            student.setId(rs.getBigDecimal("id"));
            student.setStudent_number(rs.getString("student_number"));
            student.setName(rs.getString("name"));
            student.setEmail(rs.getString("email"));
            return student;
        };

        return jdbcTemplate.query(query,rowMapper,course.getId());

    }




}
