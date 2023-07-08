package DzTask_01;


public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Andrey",Gender.male, Status.father);
        Human h2 = new Human("Marina",Gender.female, Status.mother);
        Human h3 = new Human("Daria",Gender.female, Status.child );
        Human l = new Human();
        l.addParent(h1);
        l.addParent(h2);
        l.addChild(h3);

        System.out.println(l.getInfo());
        FamilyTree tree = new FamilyTree();

        tree.addFamily(l);

        System.out.println(tree.getFamily());

        tree.removeFamily(l);

        System.out.println(tree.getFamily());
    }
}
