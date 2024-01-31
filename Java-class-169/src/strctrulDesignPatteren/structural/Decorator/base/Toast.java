package strctrulDesignPatteren.structural.Decorator.base;

public class Toast extends Item{
    @Override
    public double cost() {
        return 23.0;
    }

    @Override
    public String desc() {
        return "Toast";
    }
}
