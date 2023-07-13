package DzTask_01.File;

import DzTask_01.FamilyTree.FamilyTree;

import java.io.IOException;

public interface Workable {
    void fileWD(FamilyTree tree) throws IOException;
    void fileR() throws IOException, ClassNotFoundException;
}