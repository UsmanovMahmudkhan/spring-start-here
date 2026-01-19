package spring.springExercise.SqExrs.RestServices.SendingObjects_AsResponseBody.Country;

public class CountryDTO {
    String name;
    int population;

    public CountryDTO(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public static CountryDTO of(String name, int population) {
        return new CountryDTO(name,population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
