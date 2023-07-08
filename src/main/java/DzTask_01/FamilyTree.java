package DzTask_01;

import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Human> family;


    public FamilyTree() {
        family = new ArrayList<>();
    }

    public void addFamily(Human human) {
        family.add(human);
    }

    public void removeFamily(Human human) {
        family.remove(human);
    }

    public String getFamily() {
        StringBuilder lol = new StringBuilder();
        lol.append("The familyTree contains these people: \n");
        for (Human h: family) {
            lol.append(h.getInfo());
            lol.append("\n");
        }
        return lol.toString();
    }
}

