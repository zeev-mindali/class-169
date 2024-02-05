package old_package.demo5_functionalProgramming;

public class FunctionEvolution1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println("Zeev");
        });
        t1.start();
    }
}
