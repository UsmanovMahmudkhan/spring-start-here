package spring.springExercise.SqExrs.RestServices.SendingObjects_AsResponseBody.DTOasJSON.DTO;

public class Book {
    String name;

    public static Book of(String name){
        return new Book(name);
    }
    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
