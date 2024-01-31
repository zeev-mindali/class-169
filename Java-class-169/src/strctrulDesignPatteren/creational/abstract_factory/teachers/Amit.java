package strctrulDesignPatteren.creational.abstract_factory.teachers;

public class Amit extends Teacher{
    @Override
    public void name() {
        System.out.println("Amit");
    }

    @Override
    public String toString() {
        return "Amit{} "+super.toString();
    }
}
