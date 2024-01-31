package strctrulDesignPatteren.creational.abstract_factory.admins;

public class Shani extends Admin{
    @Override
    public void name() {
        System.out.println("Shani the Queen ");
    }

    @Override
    public String toString() {
        return "Shani{} "+super.toString();
    }
}
