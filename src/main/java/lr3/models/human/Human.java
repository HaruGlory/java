package lr3.models.human;

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
        return "Человек { " +
                "Фамилия = '" + first_name + '\'' +
                ", Имя = '" + last_name + '\'' +
                ", Отчество = '" + patronymic + '\'' +
                ", Пол = " + sex +
                " }";
    }
}
