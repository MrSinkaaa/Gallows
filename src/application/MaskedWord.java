package application;


public class MaskedWord {

    private final String word;
    private final char[] maskedWord;

    public MaskedWord(String word) {
        this.word = word;
        maskedWord = word.replaceAll("[A-Za-z]", "_").toCharArray();
    }

    public String getWord() {
        return word;
    }

    public String getMaskedWord() {
        return String.valueOf(maskedWord);
    }

    public boolean openLetter(char enteredLetter) {
        boolean isOpen = false;
        for (int i = 0; i < word.length(); i++) {
            if(enteredLetter == word.charAt(i)) {
                maskedWord[i] = enteredLetter;
                isOpen = true;
            }
        }
        return isOpen;
    }

}
