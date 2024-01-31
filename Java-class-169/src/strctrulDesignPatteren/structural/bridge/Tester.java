package strctrulDesignPatteren.structural.bridge;

import strctrulDesignPatteren.structural.bridge.printers.Delux;
import strctrulDesignPatteren.structural.bridge.printers.Mid;
import strctrulDesignPatteren.structural.bridge.printers.Printer;
import strctrulDesignPatteren.structural.bridge.printers.Regular;

public class Tester {
    public static void main(String[] args) {
        Printer[] printers= {new Delux(),new Mid(), new Regular()};
    }
}
