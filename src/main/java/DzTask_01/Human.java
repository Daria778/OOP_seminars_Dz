package DzTask_01;

import java.time.LocalDate;
import java.util.ArrayList;

public class Human {
    private String name;
    private String surname;
    private String patronymic;
    Gender gender;

    Status status;
    private ArrayList<Human> children;



    public Human(String name, String surname, String patronymic, Gender gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.gender = gender;

    }
    public Human(String name, String surname, String patronymic, Gender gender, Status status) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.gender = gender;
        this.status = status;
    }
    public Human(Human mother, Human father) {
        this.children = new ArrayList<>();
    }
    public void addChild(Human child) {
        if (child.status == Status.child) {
            children.add(child);
        }
        else {
            System.out.println(" This method adds a child, not a parent");
        }
    }
    public void removeChild(Human child) {
            children.remove(child);
    }


    @Override
    public String toString() {
        return status + ":" + surname + " " + name + " " + patronymic + ".";
    }

    public void setHuman(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;

    }

    public String getName() {
        return name;
    }

}
