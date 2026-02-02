package spring.springExercise.SqExrs.DataSource.University.Exceptions;

public class StudentNotFound extends RuntimeException {
    public StudentNotFound(String message) {
        super(message);
    }
}
