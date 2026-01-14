package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.FeedbackForm.Model;

import org.springframework.stereotype.Component;

@Component
public class Form {
    String name;
    String email;
    String text;

    public Form() {
    }

    public Form(String name, String email, String text) {
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
