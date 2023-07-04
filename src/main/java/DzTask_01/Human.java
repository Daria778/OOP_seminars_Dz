package DzTask_01;

import java.time.LocalDate;

public class Human {
    private String name;
    private String surname;
    private String patronymic;


    public Human(String name, String surname, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + ".";
    }

    public void setHuman(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }
}
