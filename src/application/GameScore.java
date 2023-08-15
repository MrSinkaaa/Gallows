package application;

public class GameScore {

    private static int wins = 0;
    private static int losses = 0;
    private static int allErrors = 0;

    public GameScore() {}

    public static int getWins() {
        return wins;
    }

    public static void addWin() {
        GameScore.wins++;
    }

    public static int getLosses() {
        return losses;
    }

    public static void addLose() {
        GameScore.losses++;
    }

    public static int getAllErrors() {
        return allErrors;
    }

    public static void addError() {
        GameScore.allErrors++;
    }
}
