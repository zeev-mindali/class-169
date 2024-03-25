package functional_programming_22_01_2024;

public class Arrow_Functions {
    public static void main(String[] args) {
        System.out.println(addNumbers(5,6));

        MathOperation addition = (int num1, int num2)->num1+num2;
        MathOperation subtraction = (int num1,int num2)->{
            System.out.println("we making a subtraction");
            return num1-num2;
        };
        int result = addition.operation(5,10);
        System.out.println(result);
    }



    public static int addNumbers(int num1, int num2){
        return num1+num2;
    }


}
