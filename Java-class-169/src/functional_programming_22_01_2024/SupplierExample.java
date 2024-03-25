package functional_programming_22_01_2024;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println(getDBconnection.get());
    }

    public static Supplier<List<String>> getDBconnection = ()->List.of(
            "jdbc://localhost:5432",
            "jdbc://127.0.0.1:5432",
            "jdbc://192.168.56.1:5432"
    );

    //localhost
    //127.0.0.1
    //192.168.56.1
}
