package DzTask_01;

import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Human> family;


    public FamilyTree() {
        this.family = new ArrayList<>();
    }

    public void addFamily(Human mother, Human father, Human children) {
        family.add(mother);
        family.add(father);
        family.add(children);
    }

    public void removeFamily(Human mother, Human father, Human children) {
        family.remove(mother);
        family.remove(father);
        family.remove(children);
    }

    public String getFamily() {
        StringBuilder lol = new StringBuilder();
        lol.append("The familyTree contains these people: \n");
        for (Human h: family) {
            lol.append(h);
            lol.append("\n");
        }
        return lol.toString();
    }
}

