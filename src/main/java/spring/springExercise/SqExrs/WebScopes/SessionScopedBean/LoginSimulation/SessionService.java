package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.LoginSimulation;

import org.springframework.stereotype.Service;

@Service
public class SessionService {

    public  Session session;
    public SessionService(Session session) {
        this.session=session;
    }

    public void set(String email){
        this.session.setEmail(email);
        this.session.setLoggedIn(true);
    }

    public Session show(){
        return session;
    }

    public void reset(){
        this.session.setEmail(null);
        this.session.setLoggedIn(false);
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
