package spring.springExercise.SqExrs.DataSource.FileUpload;

import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;


@RestController
public class Controller {

    private final Logger log= Logger.getLogger(Controller.class.getName());

    @GetMapping("/")
    public ResponseEntity<Resource> getFile() throws MalformedURLException {
        Resource resource =
                new FileUrlResource("/Users/mahmudkhonusmonov/Desktop/spring-start-here/myText");

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"myText\"")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }



}