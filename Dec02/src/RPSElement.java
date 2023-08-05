public enum RPSElement implements Comparable<RPSElement> {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private final int score;

    RPSElement(int score) {
        this.score = score;
    }

    public int fightScore(RPSElement other) {
        return switch (this) {
            case ROCK -> switch (other) {
                case ROCK -> 3;
                case PAPER -> 0;
                case SCISSORS -> 6;
            };
            case PAPER -> switch (other) {
                case ROCK -> 6;
                case PAPER -> 3;
                case SCISSORS -> 0;
            };
            case SCISSORS -> switch (other) {
                case ROCK -> 0;
                case PAPER -> 6;
                case SCISSORS -> 3;
            };
        };
    }

    public int totalScore(RPSElement other) {
        return this.fightScore(other) + this.score;
    }

    public static RPSElement fromString(String input) {
        return switch (input) {
            case "A", "X" -> ROCK;
            case "B", "Y" -> PAPER;
            case "C", "Z" -> SCISSORS;
            default -> throw new IllegalArgumentException("Unsupported value: " + input);
        };
    }
}
