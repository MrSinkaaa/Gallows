package application;

import java.util.Scanner;

public class Gallows {

    private static final String RESOURCES = "/resource/words.txt";

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary(RESOURCES);
        Scanner input = new Scanner(System.in);

        while(true) {
            displayQuestionToPlayer();
            switch (input.next().charAt(0)) {
                case 'y' -> {
                    Game game = new Game(input);
                    game.startGame(dictionary.getRandomWord());
                    displayStatistics();
                }
                case 'n' -> {
                    displayGoodBye();
                    System.exit(0);
                }
            }
        }

    }

    private static void displayQuestionToPlayer() {
        System.out.println("Do you want to play the game or leave? (y/n)");
    }

    private static void displayGoodBye() {
        System.out.println("Good bye!");
    }

    private static void displayStatistics() {
        System.out.println("===== Statistics =====");
        System.out.println("WINS: " + GameScore.getWins());
        System.out.println("LOSSES: " + GameScore.getLosses());
        System.out.println("ALL GAMES: " + (GameScore.getWins() + GameScore.getLosses()));
        System.out.println("ALL ERRORS: " + GameScore.getAllErrors());
    }
}
