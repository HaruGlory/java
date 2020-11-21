package lr3.models.common;

import lr3.models.human.Human;
import lr3.models.human.Sex;

import java.util.ArrayList;
import java.util.List;


public abstract class Organization<T> {
    protected Human head;
    protected String name;
    protected List<T> structure = new ArrayList<>();

    protected Organization(String name) {
        this.name = name;
    }

    public void setHead(String first_name, String last_name, String patronymic, Sex sex) {
        this.head = new Human(first_name, last_name, patronymic, sex);
    }

    public void append(T entity) {
        structure.add(entity);
    }
}