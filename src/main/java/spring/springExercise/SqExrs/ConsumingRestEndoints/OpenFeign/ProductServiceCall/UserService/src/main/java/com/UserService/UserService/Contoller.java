package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.ProductServiceCall.UserService.src.main.java.com.UserService.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.ProductServiceCall.ProductService.src.main.java.com.ProfileService.productService.ProfileDTO;

@RestController
public class Contoller {
    private FeignClient client;

    public Contoller(FeignClient client) {
        this.client = client;
    }

    @GetMapping("/users/{id}")
    public ProfileDTO get(@PathVariable int id){
        return client.getByID(id);
    }
}
