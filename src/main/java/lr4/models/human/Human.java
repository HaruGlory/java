package lr4.models.human;

import java.util.Objects;

public class Human {
    private final String first_name;
    private final String last_name;
    private final String patronymic;
    private final Sex sex;

    public Human(String first_name, String last_name, String patronymic, Sex sex) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "{Фамилия="+first_name +
                ", Имя="+last_name +
                ", Отчество="+patronymic +
                ", Пол="+sex+
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(first_name, human.first_name) &&
                Objects.equals(last_name, human.last_name) &&
                Objects.equals(patronymic, human.patronymic) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, patronymic, sex);
    }
}
