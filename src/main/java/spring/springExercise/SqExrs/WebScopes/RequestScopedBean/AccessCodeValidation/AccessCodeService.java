package spring.springExercise.SqExrs.WebScopes.RequestScopedBean.AccessCodeValidation;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class AccessCodeService {

    public AccessCode code;

    public AccessCodeService(AccessCode code) {
        this.code = code;
    }


    public AccessCode getCode() {
        return code;
    }

    public void setAccessCode(String accessCode) {
        code.setAccessCode(accessCode);
    }

    public String validate() {
        String massage;
        if (code.getAccessCode().equals("SEJONG9")) {
            massage = "Access Valid";
            return massage;
        } else {
            massage = "Not valid";
            return massage;
        }
    }
}
