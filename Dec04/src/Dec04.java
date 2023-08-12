import java.util.List;

public class Dec04 {

    public static void main(String[] args) {
        List<ElfShift> elfShifts = ElfShiftLoader.loadElfShifts();
        long count = elfShifts.stream().filter(ElfShift::containsOverlap).count();
        System.out.println("Number of overlapping shifts: " + count);
    }
}
