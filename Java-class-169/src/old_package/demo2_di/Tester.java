package old_package.demo2_di;

public class Tester {
    public static void main(String[] args) {
        //Setter Injection
        Dog d1 = new Dog();
        d1.setName("Bambi");
        d1.setChip(new Chip());
        System.out.println(d1);
        //need System.out.println
        d1.getChip();

        //CTOR injection
        Dog d2 = new Dog("Nipo", new Chip());
        System.out.println(d2);
        d2.getChip().info();

        //literal injection
        //collection injection....
    }
}
