package exam_prep_08_01.cls;

import java.time.LocalDate;

public class Person implements Comparable{
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
        //todo: insert a random date
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
    @Override
    public int compareTo(Object o) {
        return 0;

    }

    //user methods

}
