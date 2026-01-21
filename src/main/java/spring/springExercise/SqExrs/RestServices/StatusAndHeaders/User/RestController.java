package spring.springExercise.SqExrs.RestServices.StatusAndHeaders.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/profile")
    public ResponseEntity<UserDto>responseEntity(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("profile-version","2.2")
                .header("served-by","user")
                .header("request-id","2333fadsdsfe235fff")
                .body(new UserDto("khan",5));
    }
}
