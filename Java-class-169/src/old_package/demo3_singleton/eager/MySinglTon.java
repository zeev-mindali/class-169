package old_package.demo3_singleton.eager;

public class MySinglTon {
    //step 1 - mutual instance of the class
    private static MySinglTon instance;
    private int x= (int)(Math.random()*101);

    //step 2 - upgrade C'tor access modifier to private
    private MySinglTon(){

    }

    //step 3 - expose static getter
    public static MySinglTon getInstance(){return instance;}
    public int getX(){return x;}

    @Override
    public String toString() {
        return "MySinglTon{" +
                "x=" + x +
                '}';
    }
}
