package spring.springExercise.SqExrs.DataSource.University.Exceptions;

public class RegisteredExceptions extends Throwable {
    public RegisteredExceptions(String alreadyRegistered) {
        super(alreadyRegistered);
    }
}
