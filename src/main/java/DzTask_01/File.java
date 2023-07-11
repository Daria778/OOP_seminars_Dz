package DzTask_01;

import java.io.*;

public class File implements Serializable {
    FileOutputStream io;
    ObjectOutputStream oi;
    FileInputStream ol;
    ObjectInputStream lo;

    public File() throws IOException {
        this.io = new FileOutputStream("FamilyTree.txt");
        this.oi = new ObjectOutputStream(io);
        this.ol = new FileInputStream("FamilyTree.txt");
        this.lo = new ObjectInputStream(ol);
    }
    public void fileWD(FamilyTree tree) throws IOException{
        oi.writeObject(tree);
        oi.close();
    }
    public void fileR() throws IOException, ClassNotFoundException {
        FamilyTree tree1 = (FamilyTree) lo.readObject();
        System.out.println(tree1.getFamily());
        lo.close();
    }
}
