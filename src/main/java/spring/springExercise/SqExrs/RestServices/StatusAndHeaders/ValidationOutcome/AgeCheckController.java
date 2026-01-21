package spring.springExercise.SqExrs.RestServices.StatusAndHeaders.ValidationOutcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeCheckController {

    @Autowired
    public CheckService service;

    @GetMapping("/age-check")
    public ResponseEntity<CheckResponse> checkAge(@RequestParam int age) {
        boolean isAllowed = service.check(age);

        if (isAllowed) {
            return ResponseEntity
                    .ok(new CheckResponse(true));
        } else {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body(new CheckResponse(false));
        }
    }
}
