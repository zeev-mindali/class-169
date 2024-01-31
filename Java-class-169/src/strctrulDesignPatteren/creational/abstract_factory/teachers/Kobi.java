package strctrulDesignPatteren.creational.abstract_factory.teachers;

public class Kobi extends Teacher{
    @Override
    public void name() {
        System.out.println("Kobi");
    }

    @Override
    public String toString() {
        return "Kobi{} "+super.toString();
    }
}
