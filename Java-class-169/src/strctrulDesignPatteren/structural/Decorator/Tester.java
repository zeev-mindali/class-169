package strctrulDesignPatteren.structural.Decorator;

import strctrulDesignPatteren.structural.Decorator.base.Item;
import strctrulDesignPatteren.structural.Decorator.base.Toast;
import strctrulDesignPatteren.structural.Decorator.decorates.Olives;
import strctrulDesignPatteren.structural.Decorator.decorates.Tuna;

public class Tester {
    public static void main(String[] args) {
        Item item = new Toast();
        Item extra1 = new Olives(item);
        Item extra2 = new Tuna(item);

        System.out.println(extra1);
        System.out.println(extra2);
    }
}
