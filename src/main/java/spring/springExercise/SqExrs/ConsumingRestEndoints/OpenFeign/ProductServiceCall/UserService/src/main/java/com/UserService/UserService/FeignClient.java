package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.ProductServiceCall.UserService.src.main.java.com.UserService.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.ProductServiceCall.ProductService.src.main.java.com.ProfileService.productService.ProfileDTO;

@org.springframework.cloud.openfeign.FeignClient(name = "productService", url = "${name.server.url}")
public interface FeignClient {
    @GetMapping("/profiles/{id}")
    ProfileDTO getByID(@PathVariable int id);
}
