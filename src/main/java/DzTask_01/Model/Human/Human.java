package DzTask_01.Model.Human;


import DzTask_01.Model.FamilyTree.FamilyItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Human implements Serializable, FamilyItem {
    private String name;
    public Gender gender;
    private int age;
    private List<Human> parents;
    private List<Human> children;


    public Human(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        parents = new ArrayList<>();
        parents.add(this);
        children = new ArrayList<>();
    }


    @Override
    public String toString() {
        String t = name +
                ", " +
                age +
                ", " +
                gender;
        return t;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getAge() {
        return age;
    }
    public void addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
        } else {
            System.out.println("This child is exists in the Family Tree");
        }
    }
    public String getChild() {
        StringBuilder p = new StringBuilder();
        p.append("children: ");
        if (children.size() != 0) {
            for (int i = 0; i < children.size(); i++) {
                p.append(children.get(i).getName());
                p.append(", age is ");
                p.append(children.get(i).getAge());
            }
            return p.toString();
        }
        return null;
    }
    public List<Human> getChildren() {
        return children;
    }

    public List<Human> getParents() {
        return parents;
    }

    public void addParent(Human parent) {
        if (!parents.contains(parent)) {
            parents.add(parent);
        } else {
            System.out.println(" This parentis exists in the Family Tree");
        }
    }

    public Human getMother() {
        for (Human parent : parents) {
            if (parent.gender == Gender.female) {
                return parent;
            }
        }
        return null;
    }

    public Human getFather() {
        for (Human parent : parents) {
            if (parent.gender == Gender.male) {
                return parent;
            }
        }
        return null;
    }
}