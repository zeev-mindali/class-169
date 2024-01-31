package strctrulDesignPatteren.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Teacher {
    private int id;
    private String name;
    private String city;
    private boolean isMarried; //for ever and ever
    private boolean hasCar;
    private int children;
    private boolean isOwner;
    private int years;
    private int age;
    private String shooooProffesion;
    private String address;
    private boolean isPatzuea;
}
