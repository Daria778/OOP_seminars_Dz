package DzTask_01.Presenter;
import DzTask_01.Model.FamilyTree.FamilyTree;
import DzTask_01.Model.File.FileHandler;
import DzTask_01.Model.File.Workable;
import DzTask_01.Model.Human.Gender;
import DzTask_01.Model.Human.Human;
import DzTask_01.View.View;

import java.io.IOException;

public class Presenter {
    View view;
    FamilyTree<Human> familyTree;
    Workable file;


    public Presenter(View view) {
        this.view = view;
        familyTree = new FamilyTree<>();
        try {
            file = new FileHandler();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sortByAge() {
        familyTree.sortAge();
    }

    public void sortByName() {
        familyTree.sortName();
    }

    public void getFamilyInfo() {
        view.print(familyTree.getFamilyInfo());
    }

    public void addHuman(String name, int age, Gender gender) {
        Human h = new Human(name, gender, age);
        familyTree.addHuman(h);
    }

    public void save() {
        try {
            file.fileWD(familyTree);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void read(){
        try {
            file.fileR();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
