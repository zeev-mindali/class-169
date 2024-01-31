package strctrulDesignPatteren.structural.bridge.features;

public class Tabbed implements Feature{
    @Override
    public void print(String str) {
        for (char c : str.toCharArray()){
            System.out.print(c+"\t");
        }
        System.out.println();
    }
}

//zeev
//z   e   e   v
