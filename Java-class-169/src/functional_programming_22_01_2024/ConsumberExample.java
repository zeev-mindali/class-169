package functional_programming_22_01_2024;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumberExample {
    public static void main(String[] args) {
        sayHi.accept("Zeev");
        creditCardNumber.accept("1234-5678-1234-1234",false);
    }

    public static Consumer<String> sayHi = userName -> System.out.println("Hello "+userName);

    public static BiConsumer<String,Boolean> creditCardNumber = (creditCard,show) ->
            System.out.println(show?creditCard:"XXXX-XXXX-XXXX-XXXX");
}
