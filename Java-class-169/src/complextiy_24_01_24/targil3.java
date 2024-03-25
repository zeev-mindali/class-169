package complextiy_24_01_24;

import java.util.Scanner;

public class targil3 {
    public static boolean isLogged=false;

    public static void main(String[] args) {
        makeLogin();
    }

    private static void makeLogin(){
        if (!isLogged){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter user name:");
            String userName = scanner.nextLine();
            System.out.println("Please eneter user password:");
            String userPass = scanner.nextLine();
            checkLogin(userName,userPass);
        }
    }

    private static void checkLogin(String userName, String userPass) {
        if (userName.equals("zeev") && userPass.equals("1234")){
            isLogged=true;
            System.out.println("userLogged");
        } else {
            System.out.println("Why who are you?");
        }
    }

}
