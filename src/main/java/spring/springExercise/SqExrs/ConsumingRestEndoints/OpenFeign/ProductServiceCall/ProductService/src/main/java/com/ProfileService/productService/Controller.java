package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.ProductServiceCall.ProductService.src.main.java.com.ProfileService.productService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/profiles/{id}")
    public ProfileDTO profileDTO(@PathVariable int id){
        return new ProfileDTO(id,"Random Name",id+5);
    }
}
