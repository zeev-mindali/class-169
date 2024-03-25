package functional_programming_22_01_2024;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
//        System.out.println("without predicate");
//        System.out.println(isPhoneNumberValid("052-4043142"));
//        System.out.println(isPhoneNumberValid("055-5555555"));
//        System.out.println(isPhoneNumberValid("054-1234567"));
//        System.out.println(isPhoneNumberValidPredicate.test("052-4043142"));
//        System.out.println(isPhoneNumberValidPredicate.test("155-5555555"));
//        System.out.println(isPhoneNumberValidPredicate.test("055-5553"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("150-1234567"));
    }
    public static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("05") && phoneNumber.length()==11;
    }

    public static Predicate<String> isPhoneNumberValidPredicate = phoneNumber->
            phoneNumber.startsWith("05") && phoneNumber.length()==11;

    public static Predicate<String> containsNumber3 = phoneNumber->
            phoneNumber.contains("3");
}
