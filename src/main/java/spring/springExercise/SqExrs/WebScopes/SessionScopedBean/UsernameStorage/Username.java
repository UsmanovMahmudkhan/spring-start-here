package spring.springExercise.SqExrs.WebScopes.SessionScopedBean.UsernameStorage;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Username {

    String username;

    public Username(String username) {
        this.username = username;
    }

    public Username() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
