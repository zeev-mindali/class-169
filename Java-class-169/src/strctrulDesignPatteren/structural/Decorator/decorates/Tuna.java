package strctrulDesignPatteren.structural.Decorator.decorates;

import strctrulDesignPatteren.structural.Decorator.base.Item;

public class Tuna extends Item{
    private Item item;

    public Tuna(Item item) {
        this.item = item;
    }


    @Override
    public double cost() {
        return item.cost()+3.5;
    }

    @Override
    public String desc() {
        return item.desc()+" Tuna";
    }

    @Override
    public String toString() {
        return item.desc()+" Tuna "+this.cost();
    }
}
