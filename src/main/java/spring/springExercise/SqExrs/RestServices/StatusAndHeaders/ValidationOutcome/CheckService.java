package spring.springExercise.SqExrs.RestServices.StatusAndHeaders.ValidationOutcome;

import org.springframework.stereotype.Service;

@Service
public class CheckService {

    public boolean check(int age) {
        return age >= 18;
    }
}
