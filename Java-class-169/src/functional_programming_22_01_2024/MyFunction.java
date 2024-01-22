package functional_programming_22_01_2024;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MyFunction {
    public static void main(String[] args) {
        //System.out.println(incrementByOne(5));
        //System.out.println(incOne.apply(9));
        System.out.println(addBy1AndThenMultiplyBy10.apply(9));
    }

    public static int incrementByOne(int number){
        return number+1;
    }

    public static int incrementByOneAndMultiply(int number, int numberToMultiply){
        return (number+1)*numberToMultiply;
    }

    public static Function<Integer,Integer> incOne = number->number+1;

    public static BiFunction<Integer,Integer,Integer> incOneMultiply =
            (numberToIncrement,numberToMultiply) -> (numberToIncrement+1)*numberToMultiply;

    public static Function<Integer,Integer> multiplyBy10Function = number->number*10;

    public static Function<Integer,Integer> addBy1AndThenMultiplyBy10 =
            incOne.andThen(multiplyBy10Function);


}
