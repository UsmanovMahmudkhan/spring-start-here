package spring.springExercise.SqExrs.DataSource.FileUpload;

import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForceVsInline {

    @GetMapping("/inline")
    public ResponseEntity<Resource>getResource() throws Exception{
        var resource=new FileUrlResource("/Users/mahmudkhonusmonov/Desktop/spring-start-here/src/main/java/spring/springExercise/SqExrs/DataSource/FileUpload/java.png");
        if(resource.isFile()){
            System.out.println("it is a file");
        }
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header(HttpHeaders.CONTENT_DISPOSITION,"inline; filename:\"java.png\" ")
                .contentType(MediaType.IMAGE_PNG)
                .body(resource);
    }
}
