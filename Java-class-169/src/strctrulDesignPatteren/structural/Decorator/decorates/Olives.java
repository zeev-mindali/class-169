package strctrulDesignPatteren.structural.Decorator.decorates;

import strctrulDesignPatteren.structural.Decorator.base.Item;

public class Olives extends Item{
    private Item item;

    public Olives(Item item){
        this.item=item;
    }


    @Override
    public double cost() {
        return item.cost()+1.5;
    }

    @Override
    public String desc() {
        return item.desc()+" olives";
    }

    @Override
    public String toString() {
        return item.desc()+" olives "+this.cost();
    }
}
