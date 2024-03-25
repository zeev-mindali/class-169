package functional_programming_22_01_2024;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Targil1 {
    public static void main(String[] args) {
        System.out.println(calcDistanceCM.apply(7,8));
    }

    public static BiFunction<Integer,Integer,Integer> calcDistance =
            (num1,num2)->(int)Math.sqrt(Math.pow(num1,2)+Math.pow(num2,2));
    public static Function<Integer,Integer> convertToCM = number->number*100;

    public static BiFunction<Integer,Integer,Integer> calcDistanceCM = calcDistance.andThen(convertToCM);
}
