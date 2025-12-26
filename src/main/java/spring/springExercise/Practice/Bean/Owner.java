package spring.springExercise.Practice.Bean;

public class Owner {
    String name;
    int age;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Owner() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
