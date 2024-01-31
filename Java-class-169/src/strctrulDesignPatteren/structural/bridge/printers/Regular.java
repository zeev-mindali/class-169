package strctrulDesignPatteren.structural.bridge.printers;

public class Regular extends Printer{
    public Regular(){
        super();
        this.features.add(new strctrulDesignPatteren.structural.bridge.features.Regular());
        printTestPage("this is a test");
    }
}
