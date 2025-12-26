package spring.springExercise.Practice.Bean;


public class Car {
    String name;
    int year;
    double used_km;

    public Car() {
    }

    public Car(String name, int year, double used_km) {
        this.name = name;
        this.year = year;
        this.used_km = used_km;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getUsed_km() {
        return used_km;
    }

    public void setUsed_km(double used_km) {
        this.used_km = used_km;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", used_km=" + used_km +
                '}';
    }
}
