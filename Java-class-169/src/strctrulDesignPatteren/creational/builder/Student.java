package strctrulDesignPatteren.creational.builder;

public class Student {
    private int id;
    private String name;
    private String course;

//    public Student(int id, String name, String course) {
//        this.id = id;
//        this.name = name;
//        this.course = course;
//    }
//
//    public Student(String name, String course) {
//        this.name = name;
//        this.course = course;
//    }
//
//    public Student(String name) {
//        this.name = name;
//    }

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public Student id(int id){
        setId(id);
        return this;
    }

    public Student name(String name){
        setName(name);
        return this;
    }

    public Student course(String course){
        setCourse(course);
        return this;
    }

    public static Student build(){
        return new Student();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
