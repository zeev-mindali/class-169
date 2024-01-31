package strctrulDesignPatteren.creational.builder;

public class Tester {
    public static void main(String[] args) {
//        Student s1 = new Student(123,"Tamir","java");
//        Student s2 = new Student("Tamir","Jave");
//        Student s3 = new Student("Tamir");
//        Student s4 = new Student();

        //with builder
        Student s5 = Student.build()
                .id(50)
                .name("Tamir")
                .course("Java");

        System.out.println(s5);
        Student s6 = Student.build()
                .course("Java")
                .name("Roni");

        System.out.println(s6);


        Teacher teacher = Teacher.builder()
                .age(50)
                .city("Qiryat Yam")
                .years(10)
                .isPatzuea(false)
                .name("Zeev")
                .isMarried(true) //is happy because his wife told him
                .build();
        System.out.println(teacher);
    }
}
