package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.Car.ProductService.src.main.java.OpenFeign.ProductService;

public class Product {
    int id;
    String name;
    int number;


    public Product(int id,String name, int number) {
        this.id=id;
        this.name = name;
        this.number = number;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
