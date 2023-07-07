package DzTask_01;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Andrey", "Shkatov", "Michailovich", Gender.male, Status.father);
        Human h2 = new Human("Marina", "Komanskaya", "Vladimirovna",Gender.female, Status.mother);
        Human h3 = new Human("Daria", "Shkatova", "Andreevna", Gender.female, Status.child );
        Human children = new Human(h2, h1);


        FamilyTree family = new FamilyTree();
        family.addFamily(h2, h1, children);
        System.out.println(family.getFamily());

    }
}
