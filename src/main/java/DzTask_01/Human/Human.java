package DzTask_01.Human;
import java.io.Serializable;


public class Human implements Serializable, Comparable<Human> {
    private String name;
    public Gender gender;
    private int age;


    public Human(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    @Override
    public String toString() {
       return getInfo();
    }

    public String getInfo() {
        String t = name +
                ", " +
                age +
                ", " +
                gender;
        return t;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(Human o) {
        return name.compareTo(o.name);
    }
}