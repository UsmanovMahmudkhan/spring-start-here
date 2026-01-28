package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Car.CartService.src.main.java.OpenFeign.CartService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/card")
public class Controller {

    private final ProductProxy proxy;

    public Controller(ProductProxy proxy) {
        this.proxy = proxy;
    }

    @PostMapping("/extra")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return proxy.add(product);
    }

    @GetMapping("/all")
    public ResponseEntity<ArrayList<Product>>all(){
        return proxy.getAll();
    }

    @GetMapping("/{id}")
    public Product getOne(@PathVariable int id,@RequestParam String currency){
        return proxy.getById(id,currency);
    }
}
