package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Car.ProductService.src.main.java.OpenFeign.ProductService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller
{
    private final ProductService service;

    public Controller(ProductService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<Product>productResponseEntity(
            @RequestBody Product product
    ){
        return ResponseEntity.ok(service.addProduct(product));
    }

    @GetMapping("/all")
    public ResponseEntity<ArrayList<Product>>list(){
        return  ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(service.getProducts());
    }

    @GetMapping("/products/{id}")
    public Product getById(@PathVariable int id, @RequestParam(name = "currency") String currency)
    {
        return service.getProductByID(id);
    }
}
