package old_package.demo4_builder;

import java.time.LocalDate;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private boolean isCute;

    public static Person build(){
        return new Person();
    }

    public Person id(int id){
        this.id=id;
        return this;
    }

    public Person firstName(String firstName){
        this.firstName=firstName;
        return this;
    }

    public Person lastName(String lastName){
        this.lastName=lastName;
        return this;
    }

    public Person birthday(LocalDate birthday){
        this.birthday=birthday;
        return this;
    }

    public Person isCute(Boolean isCute){
        this.isCute=isCute;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isCute() {
        return isCute;
    }

    public void setCute(boolean cute) {
        isCute = cute;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", isCute=" + isCute +
                '}';
    }
}
