package complextiy_24_01_24;

import java.util.Scanner;

public class Targil1 {
    private static boolean[] numbers = new boolean[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int myNumber = scanner.nextInt();
        checkTheNumber(myNumber);
        printResult();
    }

    private static void printResult() {
        for (int index=0;index<numbers.length;index++){
            if (!numbers[index]){
                System.out.println("number #"+index+" not appering");
            }
        }
    }

    private static void checkTheNumber(int myNumber) {
        while (myNumber>0){
            numbers[myNumber%10]=true;
            myNumber/=10;
        }
    }

}
