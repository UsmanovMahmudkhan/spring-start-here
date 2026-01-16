package spring.springExercise.SqExrs.Chapter9.RequesScopedBean.Login;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


@Component
@RequestScope
public class LoginProcessor {
    String name;
    String password;

    public LoginProcessor(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(){
        String name=this.getName();
        String password=this.getPassword();
        if(name.equals("Natasha") && password.equals("password")){
            return true;
        }
        else {
            return false;
        }
    }
}
