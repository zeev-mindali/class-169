package strctrulDesignPatteren.structural.bridge.features;

public class Lower implements Feature{
    @Override
    public void print(String str) {
        System.out.println(str.toLowerCase());
    }
}
