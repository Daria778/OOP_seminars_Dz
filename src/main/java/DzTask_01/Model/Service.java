package DzTask_01.Model;

import DzTask_01.Model.FamilyTree.FamilyTree;
import DzTask_01.Model.File.FileHandler;
import DzTask_01.Model.Human.Gender;
import DzTask_01.Model.Human.Human;
import java.io.IOException;

public class Service implements Writable {

    private FamilyTree<Human> familyTree;
    private FileHandler file;


    public Service() {
        this.familyTree = new FamilyTree<>();
        try {
            this.file = new FileHandler();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addHuman(int age, String name, Gender gender) {
        Human student = new Human(name, gender, age);
        familyTree.addHuman(student);
    }

    public String getInfo() {
        StringBuilder lol = new StringBuilder();
        lol.append("family tree contains these people:\n");
        for (Human human:familyTree) {
            lol.append(human);
            lol.append("\n");
        }
        return lol.toString();
    }
    public void sortByName() {
        familyTree.sortName();

    }
    public void sortByAge(){
        familyTree.sortAge();
    }
    public void save(){
        try {
            file.fileWD(familyTree);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void read(){
        try {
            file.fileR();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}