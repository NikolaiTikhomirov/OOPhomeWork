package tree.human.comparators;

import java.util.Comparator;
import tree.human.FamilyTreeItem;

public class HumanComparatorByName<T extends FamilyTreeItem> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
