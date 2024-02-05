package old_package.loose_coupling;

public class Tester {
    public static void main(String[] args) {
        Android android = new Android();
        android.brose();
        android.calling();

        Mobile mobile = new Iphone();
        mobile.brose();
        mobile.calling();

        Mobile mobile2 = createPhone("iphone");
        mobile2.brose();
        mobile2.calling();
    }

    //Factory method
    public static Mobile createPhone(String input){
        return input.equalsIgnoreCase("Android")?new Android():new Iphone();
    }
}
