package spring.springExercise.SqExrs.Chapter8.HttpsMethods.Service;

import org.springframework.stereotype.Service;
import spring.springExercise.SqExrs.Chapter8.HttpsMethods.Model.Products;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Products>Allproducts=new ArrayList<>();

    public List<Products> getAll(){
        return Allproducts;
    }

    public void add(Products products){
        Allproducts.add(products);
    }

}
