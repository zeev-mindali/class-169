package strctrulDesignPatteren.creational.singleTon;

public class Tester {
    public static void main(String[] args) {
        //thread style
        Thread t1 = new Thread(()->Tamir.getInstance());
        Thread t2 = new Thread(()->Tamir.getInstance());

        t1.start();
        t2.start();


    }
}
