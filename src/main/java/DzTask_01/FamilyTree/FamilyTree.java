package DzTask_01.FamilyTree;

import DzTask_01.Human.ComparatorAge;
import DzTask_01.Human.ComparatorName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends FamilyItem> implements Serializable, Iterable<E> {
    private List<E> family;


    public FamilyTree() {
        family = new ArrayList<>();
    }

    public void addHuman(E parent) {
        family.add(parent);

    }
    @Override
    public Iterator<E> iterator() {
        return new FamilyIterator<>(family);
    }

    public void sortName() {
        family.sort(new ComparatorName<>());
    }
    public void sortAge() {
        family.sort(new ComparatorAge<>());

    }
    public String getFamilyInfo() {
        StringBuilder lol = new StringBuilder();
        lol.append("The familyTree contains these people: \n");
        for (E human: family) {
            lol.append(human);
            lol.append("\n");
        }
        return lol.toString();
    }
}