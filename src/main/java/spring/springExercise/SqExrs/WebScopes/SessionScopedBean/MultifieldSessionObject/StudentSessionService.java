package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.MultifieldSessionObject;

import org.springframework.stereotype.Service;
import java.util.logging.Logger;

@Service
public class StudentSessionService {

    private final StudentSession studentSession;
    private Logger log = Logger.getLogger(StudentSessionService.class.getName());

    public StudentSessionService(StudentSession studentSession) {
        this.studentSession = studentSession;
    }

    public StudentSession getAllInfo() {
        return studentSession;
    }

    public boolean setSession(String name, String department, int year) {

        if ((name.length() >= 5 && name.matches("[A-Za-z]+")) &&
                department.matches("[A-Za-z]+") &&
                (year >= 1 && year <= 6)) {

            studentSession.setName(name);
            studentSession.setMajor(department);
            studentSession.setYear(year);
            return true;

        } else {
            log.severe("Error in student session setting");
            clearSession();
            return false;
        }
    }

    public void clearSession() {
        studentSession.setName(null);
        studentSession.setMajor(null);
        studentSession.setYear(0);
    }
}