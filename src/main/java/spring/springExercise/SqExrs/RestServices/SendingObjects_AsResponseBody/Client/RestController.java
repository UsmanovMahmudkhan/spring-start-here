package spring.springExercise.SqExrs.RestServices.SendingObjects_AsResponseBody.Client;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String getClient(){
        return "Hello Client";
    }
}
