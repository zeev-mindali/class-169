package strctrulDesignPatteren.creational.abstract_factory.teachers;

public class Zeev extends Teacher{
    @Override
    public void name() {
        System.out.println("zeev");
    }

    @Override
    public String toString() {
        return "Zeev{} "+super.toString();
    }
}
