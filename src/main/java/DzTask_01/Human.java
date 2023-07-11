package DzTask_01;

import java.io.Serializable;
import java.util.ArrayList;

public class Human implements Serializable {
    private String name;
    Gender gender;
    private ArrayList<Human> children;
    private ArrayList<Human> parents;


    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;

    }

    public Human() {
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public void addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
        } else {
            System.out.println(" This child is exists in the Family Tree");
        }
    }

    public void addParent(Human parent) {
        if ((parent.gender == Gender.female | parent.gender == Gender.male) & !parents.contains(parent)) {
            parents.add(parent);
        } else {
            System.out.println(" This parentis exists in the Family Tree");
        }
    }

    public void removeParent(Human parent) {
        parents.remove(parent);
    }

    public void removeChild(Human child) {
        children.remove(child);
    }

    public String childInfo() {
        StringBuilder p = new StringBuilder();
        p.append("children: ");
        if (children.size() != 0) {
            for (int i = 0; i < children.size(); i++) {
                p.append(children.get(i).getName());
            }
            return p.toString();
        }
        return null;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        StringBuilder t = new StringBuilder();
        t.append(getInfoM());
        t.append("\n");
        t.append(getInfoF());
        t.append("\n");
        t.append(childInfo());
        t.append("\n");
        return t.toString();
    }

    public String getName() {
        return name;
    }

    public Human getMother() {
        for (Human parent : parents) {
            if (parent.gender == Gender.female) {
                return parent;
            }
        }
        return null;
    }
    public String getInfoM() {
        String res = "mother: ";
        Human mother = getMother();
        res += mother.getName();
        return res;
    }

    public Human getFather() {
        for (Human parent : parents) {
            if (parent.gender == Gender.male) {
                return parent;
            }
        }
        return null;
    }
    public String getInfoF() {
        String res = "father: ";
        Human father = getFather();
        res += father.getName();
        return res;
    }
}