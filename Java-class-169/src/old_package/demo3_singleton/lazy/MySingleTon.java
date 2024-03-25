package old_package.demo3_singleton.lazy;

import old_package.demo3_singleton.eager.MySinglTon;

public class MySingleTon {
    //Step 1 - mutual instance of the class
    private static MySingleTon instance = null;

    private int x = (int)(Math.random()*101);
    private MySingleTon(){
        System.out.println("CTOR IN ACTION :o)");
    }

    public static MySingleTon getInstance(){
        if (instance==null){
            synchronized (MySinglTon.class){
                if (instance==null){
                    instance = new MySingleTon();
                }
            }
        }
        return instance;
    }

    public int getX(){return this.x;}

    @Override
    public String toString() {
        return "MySingleTon{" +
                "x=" + x +
                '}';
    }
}
