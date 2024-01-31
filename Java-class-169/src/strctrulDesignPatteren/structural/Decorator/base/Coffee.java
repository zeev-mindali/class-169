package strctrulDesignPatteren.structural.Decorator.base;

public class Coffee extends Item{
    @Override
    public double cost() {
        return 10.0;
    }

    @Override
    public String desc() {
        return "coffee";
    }


}
