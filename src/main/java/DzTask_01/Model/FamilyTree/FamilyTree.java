package DzTask_01.Model.FamilyTree;

import DzTask_01.Model.Human.ComparatorAge;
import DzTask_01.Model.Human.ComparatorName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends FamilyItem> implements Serializable, Iterable<E> {
    private List<E> family;


    public FamilyTree() {
        family = new ArrayList<>();
    }

    public void addHuman(E human) {
        family.add(human);

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
}