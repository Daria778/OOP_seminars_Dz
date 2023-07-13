package DzTask_01.FamilyTree;

import DzTask_01.Human.ComparatorAge;
import DzTask_01.Human.Gender;
import DzTask_01.Human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Serializable, Iterable<Human> {
    private List<Human> family;
    private List<Human> children;
    private List<Human> parents;


    public void addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
        } else {
            System.out.println(" This child is exists in the Family Tree");
        }

    }
    public String childInfo() {
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


    public FamilyTree() {
        family = new ArrayList<>();
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public void addHuman(Human human) {
        family.add(human);

    }
    @Override
    public Iterator<Human> iterator() {
        return new FamilyIterator(family);
    }

    public void sortName() {
        Collections.sort(family);
    }
    public void sortAge() {
        family.sort(new ComparatorAge());

    }
    public String getFamilyInfo() {
        StringBuilder lol = new StringBuilder();
        lol.append("The familyTree contains these people: \n");
        for (Human human: family) {
            lol.append(human.getInfo()
            );
            lol.append("\n");
        }
        return lol.toString();
    }
}

