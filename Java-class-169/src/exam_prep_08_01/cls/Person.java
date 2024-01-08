package exam_prep_08_01.cls;

import exam_prep_08_01.DateCls.DateFactory;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{
    //todo: teach generic classes
    //fields
    private Integer id;
    private String name;
    private LocalDate birthday;

    //for getting a running number on each instance that we will create
    private static Integer counter=0;
    //constructors
    public Person() {
        this(0,"person",null);
    }

    public Person(String name, LocalDate birthday) {
        this(0,name,birthday);
    }

    public Person(Integer id, String name, LocalDate birthday) {
        counter++;
        setId(counter);
        setName(name);
        setBirthday(DateFactory.getLocalDate());
    }

    //getters/setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name+this.id;
    }

    /* string manipulation
        "fiat"+1+2+7=>fiat127
        "fiat"+(1+2+7)->fiat10
    */
    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    //toString, hashCode, equal
    public int compareTo(Person person) {
        return this.birthday.compareTo(person.birthday);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthday);
    }

    //user methods

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=[" + DateFactory.beautifyDate(this.getBirthday()) +
                "]}";
    }
}
