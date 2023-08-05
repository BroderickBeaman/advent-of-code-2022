import java.util.List;
import java.util.OptionalInt;

public class Dec01 {
    public static void main(String[] args) {

        List<Elf> elves = ElfLoader.loadElves();
        OptionalInt max = elves.stream().mapToInt(Elf::sumFood).max();
        System.out.println("Max Calorie");
        System.out.println(max.getAsInt());
    }
}