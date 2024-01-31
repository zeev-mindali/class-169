package strctrulDesignPatteren.creational.prototype;

public class Tester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Story s1 = new Story();
        System.out.println(s1);

        Story s2 = s1.clone();
        System.out.println(s2);
    }
}
