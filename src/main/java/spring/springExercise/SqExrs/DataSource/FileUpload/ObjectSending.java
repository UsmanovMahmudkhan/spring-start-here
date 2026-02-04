package spring.springExercise.SqExrs.DataSource.FileUpload;

import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjectSending {

    @GetMapping("/user")
    public ResponseEntity<UserModel> getUser(){
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .header(HttpHeaders.CONTENT_DISPOSITION,"application/xml; filename:\"UserModel.java\"")
                .contentType(MediaType.APPLICATION_JSON)
                .body(new UserModel("hi"));
    }
}
