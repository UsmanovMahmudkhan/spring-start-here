package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.AccessCodeValidation;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.logging.Logger;

@Component
@RequestScope
public class AccessCode {
    String accessCode;

    public AccessCode() {
    }

    public AccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }


}
