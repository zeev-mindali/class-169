package old_package.demo6_Comparable;

import old_package.demo4_builder.Person;

import java.util.Comparator;

public class SortById implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getId() - o2.getId();
    }
}
