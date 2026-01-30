package spring.springExercise.SqExrs.DataSource.University.Repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import spring.springExercise.SqExrs.DataSource.University.Model.Course;

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



}
