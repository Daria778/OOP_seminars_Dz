package DzTask_01;

import java.util.ArrayList;

public class FamilyTree {
    private ArrayList<Human> family;

    public FamilyTree() {
        this.family = new ArrayList<>();
    }
    public void addHuman(Human h) {
        this.family.add(h);
    }

    public void removeHuman(Human h) {
        this.family.remove(h);
    }


}
