package old_package.demo6_Comparable;

import old_package.demo4_builder.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEvolution5 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person1 = Person.build().firstName("Zeev").lastName("Mindali");
        Person person2 = Person.build().isCute(false).id(123);
        people.add(person1);
        people.add(person2);

        Collections.sort(people,(p1,p2)->p1.getId()-p2.getId());
    }
}
