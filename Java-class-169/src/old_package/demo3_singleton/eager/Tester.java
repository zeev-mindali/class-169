package old_package.demo3_singleton.eager;

public class Tester {
    public static void main(String[] args) {
        MySinglTon s1 = MySinglTon.getInstance();
        MySinglTon s2 = MySinglTon.getInstance();
        System.out.println(s1.getX());
        System.out.println(s2.getX());
    }
}
