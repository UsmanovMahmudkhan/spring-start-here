package spring.springExercise.SqExrs.RestServices.StatusAndHeaders.User;

public class UserDto {
    String name;
    int level;

    public UserDto(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
