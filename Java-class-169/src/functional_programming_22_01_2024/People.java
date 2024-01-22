package functional_programming_22_01_2024;

import java.util.ArrayList;
import java.util.List;

public class People {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("zeev",Gender.MALE),
                new Person("Amital",Gender.FEMALE),
                new Person("Tamir",Gender.MALE),
                new Person("Tim",Gender.MALE),
                new Person("Shani",Gender.FEMALE)
        );
        //imperativeApproach(people);
        declarativeApproach(people);
    }

    private static void declarativeApproach(List<Person> people) {
        List<Person> males = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .toList();
        males.forEach(System.out::println);
    }

    public static void imperativeApproach(List<Person> people){
        List<Person> females = new ArrayList<>();

        for (Person person:people){
            if (person.getGender().equals(Gender.FEMALE)){
                females.add(person);
            }
        }

        for (Person female:females){
            System.out.println(female);
        }
    }
}
