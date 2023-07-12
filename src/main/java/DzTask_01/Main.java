package DzTask_01;


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Human h1 = new Human("Andrey",Gender.male);
        Human h2 = new Human("Marina",Gender.female);
        Human h3 = new Human("Daria",Gender.female);
        Human l = new Human();
        l.addParent(h1);
        l.addParent(h2);
        l.addChild(h3);

        System.out.println(l.getInfo());
        FamilyTree tree = new FamilyTree();

        tree.addFamily(l);

        System.out.println(tree.getFamily());

        FileHandler old = new FileHandler();
        old.fileWD(tree);
        old.fileR();
    }
}
