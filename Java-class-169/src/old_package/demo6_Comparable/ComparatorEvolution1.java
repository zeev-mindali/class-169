package old_package.demo6_Comparable;

import old_package.demo4_builder.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEvolution1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person p1 = Person.build().firstName("Zeev").lastName("Mindali");
        Person p2 = Person.build().isCute(false).id(123);
        people.add(p1);
        people.add(p2);

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getId()-p2.getId();
            }
        };
        Collections.sort(people,comparator);
    }
}
