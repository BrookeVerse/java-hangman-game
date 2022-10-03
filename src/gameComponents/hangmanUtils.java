package gameComponents;

import java.util.ArrayList;
import java.util.Random;

public class hangmanUtils {
    private String hiddenWord = "";
    private String word = "";

    public String getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<String> words = new ArrayList<>();
    private final Random RANDOM = new Random();

    public hangmanUtils(){
        words.add("Java");
        words.add("Sout");
        words.add("Static");
        words.add("Variables");
        words.add("Scanner");
        this.word = generateRandomWord();
    }

    public String generateRandomWord() {
        return words.get(RANDOM.nextInt(words.size()));
    }

    public String generateHiddenWord(String word) {
        return "_".repeat(word.length());
    }

    public String revealGuess(String word, String letterGuess) {
        StringBuilder newWord = new StringBuilder();
        if (word.contains(letterGuess)){
            System.out.println("Correct! " + letterGuess + " is in the word.");
            String replaceGuess = word.replace(letterGuess, "");
            newWord.append(replaceGuess);
        } else {

        }
        return newWord.toString();
    }
}
