package strctrulDesignPatteren.creational.prototype;

public class Dwarf {
    private static int count= 1;
    private int id = count++;

    @Override
    public String toString() {
        return "Dwarf{" +
                "id=" + id +
                '}';
    }
}
