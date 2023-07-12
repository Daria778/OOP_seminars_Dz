package DzTask_01;

import java.io.*;

public class FileHandler implements Serializable, Workable {
    private FileOutputStream io;
    private ObjectOutputStream oi;
    private FileInputStream ol;
    private ObjectInputStream lo;

    public FileHandler() throws IOException {
        this.io = new FileOutputStream("FamilyTree.txt");
        this.oi = new ObjectOutputStream(io);
        this.ol = new FileInputStream("FamilyTree.txt");
        this.lo = new ObjectInputStream(ol);
    }
    @Override
    public void fileWD(FamilyTree tree) throws IOException {
        oi.writeObject(tree);
        oi.close();
    }
    @Override
    public void fileR() throws IOException, ClassNotFoundException {
        FamilyTree tree1 = (FamilyTree) lo.readObject();
        System.out.println(tree1.getFamily());
        lo.close();
    }
}
