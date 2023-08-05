import java.util.List;

public class Elf {

    private List<Integer> inventory;

    public Elf(List<Integer> inventory) {
        this.inventory = inventory;
    }

    public List<Integer> getInventory() {
        return inventory;
    }

    public void setInventory(List<Integer> inventory) {
        this.inventory = inventory;
    }

    public Integer sumFood() {
        return inventory.stream().reduce(0, Integer::sum);
    }
}
