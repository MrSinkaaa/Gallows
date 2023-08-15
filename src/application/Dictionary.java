package application;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dictionary {

    private static List<String> words;

    public Dictionary(String fileName) {
        words = new ArrayList<>();
        loadDictionaryFromFile(fileName);
    }

    private void loadDictionaryFromFile(String fileName) {
        InputStream list = this.getClass().getResourceAsStream(fileName);
        if(list == null) {
            throw new RuntimeException("File " + fileName + " not found");
        }
        words = new BufferedReader(new InputStreamReader(list)).lines().toList();
    }

    public String getRandomWord() {
        int randomIndex = new Random().nextInt(words.size() - 1);
        return words.get(randomIndex);
    }

}
