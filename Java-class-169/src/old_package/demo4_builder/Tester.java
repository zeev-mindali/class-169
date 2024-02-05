package old_package.demo4_builder;

import java.time.LocalDate;

public class Tester {
    public static void main(String[] args) {
        Person tim = Person
                .build()
                .isCute(false)
                .id(345345)
                .firstName("Tim")
                .lastName("Kia")
                .birthday(LocalDate.of(1989,05,06));

        System.out.println(tim);
    }
}
