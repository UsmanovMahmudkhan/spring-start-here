package spring.springExercise.SqExrs.DataSource.JDBCTemplate;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class ProductController {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ProductController.class);
    private final Logger logger=Logger.getLogger(ProductController.class.getName());

    @Autowired
    ProductRepo productRepo;

    @PostMapping("/add")
    public void update(@RequestBody Product product){
        productRepo.save(product);
        log.info("Product has been addded to H@ database");
    }
    @GetMapping("/all")
    public List<Product>getAll(){
        return productRepo.getAllProduct();
    }
}
