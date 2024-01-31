package strctrulDesignPatteren.structural.bridge.printers;

import strctrulDesignPatteren.structural.bridge.features.Lower;
import strctrulDesignPatteren.structural.bridge.features.Tabbed;

public class Mid extends Printer{
    public Mid(){
        super();
        this.features.add(new Lower());
        this.features.add(new Tabbed());
        printTestPage("this is a test");
    }
}
