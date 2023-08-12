import java.util.List;

public class Dec04Part2 {
    public static void main(String[] args) {
        List<ElfShift> elfShifts = ElfShiftLoader.loadElfShifts();
        long count = elfShifts.stream().filter(ElfShift::containsPartialOverlap).count();
        System.out.println("Number of overlapping shifts: " + count);
    }
}
