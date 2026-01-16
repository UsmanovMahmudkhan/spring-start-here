package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.UsernameStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserNameService {

    @Autowired
    public Username username;

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public String getUser(){
        return username.getUsername();
    }
}
