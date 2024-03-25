package old_package.demo5_functionalProgramming;

public class FunctionalEvolution0 {
    public static void main(String[] args) {
        Runnable myRunnable = () -> System.out.println("zeev");
        Thread t1 = new Thread(myRunnable);
        t1.start();
    }
}
