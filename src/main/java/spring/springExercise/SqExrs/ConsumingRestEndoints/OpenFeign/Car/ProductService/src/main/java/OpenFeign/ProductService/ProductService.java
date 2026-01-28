package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Car.ProductService.src.main.java.OpenFeign.ProductService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ProductService {

    private ArrayList<Product>products=new ArrayList<>();


    public Product addProduct(Product product){
        if(!product.getName().isEmpty() && product.getNumber()!=0 && !product.getName().isBlank())
        {
            products.add(product);
            return product;
        }
        else {
            return null;
        }
    }

    public Product getProductByID(int id){
        Product requestProduct=null;
        for(Product p:products){
            if(p.getId()==id){
                requestProduct=p;
                return requestProduct;
            }
        }
              return requestProduct;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }



}
