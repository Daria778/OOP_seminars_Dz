package DzTask_01;


import DzTask_01.FamilyTree.FamilyTree;
import DzTask_01.File.FileHandler;
import DzTask_01.Human.Gender;
import DzTask_01.Human.Human;

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        Human h1 = new Human("Andrey", Gender.male, 44);
        Human h2 = new Human("Marina",Gender.female, 43);
        Human h3 = new Human("Daria",Gender.female, 15);

        FamilyTree f = new FamilyTree();
        f.addHuman(h2);
        f.addHuman(h1);
        f.addHuman(h3);

        System.out.println(f.getFamilyInfo());
        f.sortName();
        f.sortAge();
        System.out.println(f.getFamilyInfo());

        FileHandler old = new FileHandler();
        old.fileWD(f);
        old.fileR();
    }
}
