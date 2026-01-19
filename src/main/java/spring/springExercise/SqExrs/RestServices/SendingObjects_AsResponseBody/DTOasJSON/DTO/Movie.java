package spring.springExercise.SqExrs.RestServices.SendingObjects_AsResponseBody.DTOasJSON.DTO;

public class Movie {
    String name;
    String author;
    String jangler;

    public Movie(String name, String author, String jangler) {
        this.name = name;
        this.author = author;
        this.jangler = jangler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getJangler() {
        return jangler;
    }

    public void setJangler(String jangler) {
        this.jangler = jangler;
    }
}
