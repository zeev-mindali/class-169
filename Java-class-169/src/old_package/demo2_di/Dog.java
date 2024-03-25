package old_package.demo2_di;

public class Dog {
    private String name;
    private Chip chip;

    public Dog(){

    }
    public Dog(String name, Chip chip) {
        this.name = name;
        this.chip = chip;
    }

    public String getName() {
        return name;
    }

    public Chip getChip() {
        return chip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", chip=" + chip +
                '}';
    }
}
