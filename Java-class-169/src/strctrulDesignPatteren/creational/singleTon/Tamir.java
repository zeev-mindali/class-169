package strctrulDesignPatteren.creational.singleTon;

public class Tamir {
    private static Tamir instance = null;

    private Tamir(){
        System.out.printf("%s instance was invoked\n",this.getClass().getSimpleName());
    }

    public static Tamir getInstance(){
        if (instance == null){
            synchronized (Tamir.class){
                if (instance == null){
                    instance = new Tamir();
                }
            }
        }
        return instance;
        //return new Tamir();
    }

    public void sayHello() {
        System.out.println("Hello from Tamir");
    }
}
