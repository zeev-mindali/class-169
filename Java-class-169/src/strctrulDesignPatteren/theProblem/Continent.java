package strctrulDesignPatteren.theProblem;

import java.util.List;

public class Continent {
    List<Harbivar> harbivars;
    List<Carnivar> carnivars;

    public Continent(List<Harbivar> harbivars, List<Carnivar> carnivars) {
        this.harbivars = harbivars;
        this.carnivars = carnivars;
    }
}
