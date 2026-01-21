package spring.springExercise.SqExrs.RestServices.StatusAndHeaders.CustomStatus;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public ResponseEntity<Comment>commentResponseEntity(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Name","user")
                .header("country","london")
                .header("type","message")
                .body(new Comment("Salom"));
    }
}
