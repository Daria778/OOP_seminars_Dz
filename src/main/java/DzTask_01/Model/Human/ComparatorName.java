package DzTask_01.Model.Human;


import DzTask_01.Model.FamilyTree.FamilyItem;

import java.util.Comparator;

public class ComparatorName<E extends FamilyItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
