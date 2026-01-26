package spring.springExercise.SqExrs.ConsumingRestEndoints.OpenFeign.ProductServiceCall.ProductService.src.main.java.com.ProfileService.productService;

public class ProfileDTO {
    private int id;
    private String name;
    private int age;

    public ProfileDTO(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
