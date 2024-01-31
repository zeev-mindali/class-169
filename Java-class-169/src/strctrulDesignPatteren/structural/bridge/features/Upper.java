package strctrulDesignPatteren.structural.bridge.features;

public class Upper implements Feature{
    @Override
    public void print(String str) {
        System.out.println(str.toUpperCase());
    }
}
