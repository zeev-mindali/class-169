package strctrulDesignPatteren.structural.bridge.printers;

import strctrulDesignPatteren.structural.bridge.features.Lower;
import strctrulDesignPatteren.structural.bridge.features.Regular;
import strctrulDesignPatteren.structural.bridge.features.Tabbed;
import strctrulDesignPatteren.structural.bridge.features.Upper;

public class Delux extends Printer{
    public Delux(){
        super();
        this.features.add(new Regular());
        this.features.add(new Upper());
        this.features.add(new Lower());
        this.features.add(new Tabbed());
        printTestPage("This is a test");
    }
}
