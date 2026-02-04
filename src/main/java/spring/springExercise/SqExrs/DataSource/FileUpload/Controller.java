package spring.springExercise.SqExrs.DataSource.FileUpload;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.net.MalformedURLException;

@RestController
public class Controller {
    @GetMapping("/")
    public ResponseEntity<FileUrlResource> getFile() throws MalformedURLException {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(new FileUrlResource("/Users/mahmudkhonusmonov/Desktop/spring-start-here/myText"));

    }

}