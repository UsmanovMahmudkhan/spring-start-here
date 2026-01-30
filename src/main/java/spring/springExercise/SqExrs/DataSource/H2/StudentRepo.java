package spring.springExercise.SqExrs.DataSource.H2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {

    private final JdbcTemplate template;

    public StudentRepo(JdbcTemplate template) {
        this.template = template;
    }

    public void addStudent(Student student){
        String exc="INSERT INTO student(name,age) VALUES (?,?)";
        template.update(exc,student.getName(),student.getAge());
    }

    public List<Student>allStudent(){
        String exc="SELECT * from student";
        RowMapper<Student>studentRowMapper=(rs,index)
        ->{
            Student student=new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            return student;
        };

        return template.query(exc,studentRowMapper);

    }

    public List<Student> student(int id){
        String exc="Select * FROM student WHERE id="+id;
        RowMapper<Student>studentRowMapper=(rs,index)
        ->{
            Student student=new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setAge(rs.getInt("age"));
            return student;
        };

         var student=  template.query(exc,studentRowMapper);
         return student;
    }
}
