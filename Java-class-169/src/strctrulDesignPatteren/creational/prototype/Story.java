package strctrulDesignPatteren.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Story {
    private Princess princess;
    private List<Dwarf> dwarves;

    public Story() {
        princess = new Princess();
        dwarves = new ArrayList<>();
        dwarves.add(new Dwarf());
        dwarves.add(new Dwarf());
        dwarves.add(new Dwarf());
        dwarves.add(new Dwarf());
        dwarves.add(new Dwarf());
        dwarves.add(new Dwarf());
        dwarves.add(new Dwarf());
    }

    public Princess getPrincess() {
        return princess;
    }

    public List<Dwarf> getDwarves() {
        return dwarves;
    }

    public void setPrincess(Princess princess) {
        this.princess = princess;
    }

    public void setDwarves(List<Dwarf> dwarves) {
        this.dwarves = dwarves;
    }

    @Override
    public String toString() {
        return "Story{" +
                "princess=" + princess +
                ", dwarves=" + dwarves +
                '}';
    }

    protected Story clone() throws CloneNotSupportedException{
        //the developer should decide whether create "new new " object
        //or  return refernce to the same objects
        return new Story();
    }
}
