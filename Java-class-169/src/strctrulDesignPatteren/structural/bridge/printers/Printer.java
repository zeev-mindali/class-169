package strctrulDesignPatteren.structural.bridge.printers;

import strctrulDesignPatteren.structural.bridge.features.Feature;

import java.util.ArrayList;
import java.util.List;

public abstract class Printer {
    protected List<Feature> features;

    public Printer() {
        this.features = new ArrayList<>();
    }

    public void printTestPage(String str){
        for (Feature feature:features){
            feature.print(str);
        }
        System.out.println("----------------------");
    }
}
