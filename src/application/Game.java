package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static Scanner input;
    private static Scaffold[] scaffolds = Scaffold.values();
    private MaskedWord maskedWord;
    private List<Character> usedLetters;
    private List<Character> wrongLetters;
    private int errorCount;

    public Game(Scanner input) {
        this.input = input;
        usedLetters = new ArrayList<>();
        wrongLetters = new ArrayList<>();
        errorCount = 0;
    }

    public void startGame(String word) {
        maskedWord = new MaskedWord(word);

        while (errorCount < 6 && !isUserWon()) {
            displayStateOfWord();

            char inputLetter = input.next().charAt(0);
            if (isGuessedLetterRight(inputLetter)) {
                if (maskedWord.openLetter(inputLetter)) {
                    usedLetters.add(inputLetter);
                } else {
                    wrongLetters.add(inputLetter);
                    errorCount++;
                    GameScore.addError();
                }
            }

            displayStateOfScaffold();
            displayWrongLetters();

        }
        if (isUserWon()) {
            GameScore.addWin();
        } else {
            GameScore.addLose();
        }
        displayLastGameMessage();
    }

    private boolean isGuessedLetterRight(char inputLetter) {
        if (!Character.isLetter(inputLetter)) {
            displayMessageOfInvalidInput();
            return false;
        }
        if (usedLetters.contains(inputLetter)) {
            displayMessageOfRepeatedLetter();
            return false;
        }
        return true;
    }

    private boolean isUserWon() {
        return maskedWord.getWord().equals(maskedWord.getMaskedWord());
    }

    private void displayMessageOfRepeatedLetter() {
        System.out.println("You have already written this letter!");
    }

    private void displayStateOfWord() {
        System.out.println("Guesses word: " + maskedWord.getMaskedWord());
    }

    private void displayStateOfScaffold() {
        System.out.println(scaffolds[errorCount]);
    }

    private void displayMessageOfInvalidInput() {
        System.out.println("This is not a letter!");
    }

    private void displayWrongLetters() {
        System.out.print("Wrong letters (" + wrongLetters.size() + "): ");
        wrongLetters.forEach(letter -> System.out.print(letter + " "));
        System.out.println();
    }

    private void displayLastGameMessage() {
        System.out.println("You " + (errorCount < 6 ? "guessed the word: "
              : "lost the game. The word is: ") + maskedWord.getWord());
    }
}
