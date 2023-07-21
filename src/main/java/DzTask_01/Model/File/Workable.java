package DzTask_01.Model.File;

import DzTask_01.Model.FamilyTree.FamilyTree;

import java.io.IOException;

public interface Workable {
    void fileWD(FamilyTree tree) throws IOException;
    void fileR() throws IOException, ClassNotFoundException;
}