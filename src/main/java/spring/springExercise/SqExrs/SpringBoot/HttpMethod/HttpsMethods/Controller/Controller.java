package spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods.Model.Products;
import spring.springExercise.SqExrs.SpringBoot.HttpMethod.HttpsMethods.Service.ProductService;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    public ProductService service;

    @GetMapping("/products")
    public String getAll(Model model){
        model.addAttribute("products", service.getAll());
        return "allproducts.html";
    }

    @PostMapping("/products")
    public String add(@RequestParam String name, @RequestParam Integer price, Model model){
        var product=new Products(name,price);
        service.add(product);
        model.addAttribute("products", service.getAll());
        return "allproducts.html";
    }
}
