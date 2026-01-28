package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Car.CartService.src.main.java.OpenFeign.CartService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@FeignClient(name = "ProductService", url = "${name.server.url}")
public interface ProductProxy {

    @PostMapping("/add")
    ResponseEntity<Product> add(@RequestBody Product product);

    @GetMapping("/all")
    ResponseEntity<ArrayList<Product>>getAll();

    @GetMapping("/products/{id}")
    Product getById(@PathVariable int id, @RequestParam(name = "currency") String currency);
}
