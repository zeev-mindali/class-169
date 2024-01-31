package strctrulDesignPatteren.structural.proxy;

public class Machine {
    private double cost = 0.0;

    public String toUpper(String input){
        cost += 10;
        return input.toUpperCase();
    }

    public double getCost(){
        return cost;
    }
}
