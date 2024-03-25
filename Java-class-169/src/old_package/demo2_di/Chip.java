package old_package.demo2_di;

import java.util.UUID;

public class Chip {
    private UUID chip = UUID.randomUUID();

    public UUID getChip() {
        return chip;
    }

    public void setChip(UUID chip) {
        this.chip = chip;
    }

    public void info(){
        System.out.println(chip.toString());
    }

    @Override
    public String toString() {
        return "Chip{" +
                "chip=" + chip +
                '}';
    }
}
