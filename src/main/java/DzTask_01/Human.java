package DzTask_01;

import java.util.ArrayList;

public class Human {
    private String name;
    Gender gender;

    Status status;
    private ArrayList<Human> children;
    private ArrayList<Human> parents;


    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;

    }

    public Human(String name, Gender gender, Status status) {
        this.name = name;
        this.gender = gender;
        this.status = status;
    }

    public Human() {
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public void addChild(Human child) {
        if (child.status == Status.child & !children.contains(child)) {
            children.add(child);
        } else {
            System.out.println(" This method adds a child, not a parent");
        }
    }

    public void addParent(Human parent) {
        if ((parent.status == Status.mother | parent.status == Status.father) & !parents.contains(parent)) {
            parents.add(parent);
        } else {
            System.out.println(" This method adds a parent, not a child");
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
            if (parent.status == Status.mother) {
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
            if (parent.status == Status.father) {
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