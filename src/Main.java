import gameComponents.Prompts;
import gameComponents.hangmanUtils;

import java.util.Scanner;


public class Main {
    public String letterGuess;
    public String hiddenWord;
    public String word;
    public static void main(String[] args) {
        //Hangman Game
       Player player = new Player();
       Prompts prompts = new Prompts();
        hangmanUtils utils = new hangmanUtils();

        utils.generateRandomWord();
        //Starting the game
        Scanner scanner = new Scanner(System.in);
        //Prompts About what the game is and how they will play
        //Another prompt that will ask them if they would like to play
        //If statement for yes or no no, yes will start the game, no will stop the programme
        //METHOD (startGame) || (resetGame)
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Lets begin");
        } else {
            System.out.println("Ok, see you!");
        }
        //The Game
        //Global variable
        //int Life = 5; ??
        //Static Block
        //Array of words to be guessed



        //METHOD (generateRandomWord)
        //grab a random word from the array of words - maybe break it down to characters

//        char[] letters = word.toCharArray();
        System.out.println(player.getLives());
        //METHOD (convertWord)
        //this will grab the random word and convert it to underscores.
        //the Player
        //A prompt will bring out the dashes (hidden word)
        System.out.println(utils.generateHiddenWord(word));
        System.out.println(hiddenWord);
        //prompt that asks what id their first guess?
        System.out.println("What letter would you like to guess?");
        String letterGuess = scanner.next();
        while(hiddenWord.contains("_")){
            System.out.println(word);
            word = revealGuess(word, letterGuess);
            System.out.println(word);
            hiddenWord = utils.generateHiddenWord(word);
            System.out.println(hiddenWord);
            System.out.println("Next Guess?");
            letterGuess = scanner.next();
        }
        System.out.println("You did it the word was " + yourWord);



        //METHOD (playerGuess)

        //store the user guess (maybe they can enter a whole word and if it's the same they got it but if it isn't lose a life)
        //If the guess is right
        //METHOD (revealGuess)
        //Convert an underscore back into a char

        //prompt that hidden word with the character that has been entered revealed
        //Prompt for next guess
        //else
        //prompt that they guessed wrong
        //METHOD (lifeScore)
        //when a wrong answer is found, set the variable down by one
        //represent that they lost a life from the life int.

        //Rinse and Repeat until...

        //The End
        //METHOD (guessedWord)
        //If (convertWord is revealed)
        //prompt the full word
        //prompt that they have won
        //prompt would you like to play again?
        //if yes (startGame)
        //if no (resetGame)

        //When they run out of lives
        //prompt that they have run out of lives
        //prompt would you like to play again?
        //if yes (startGame)
        //if no (resetGame)
    }
    public String readGuess (Scanner scanner, String prompt) {
         System.out.println(prompt);
        return scanner.next();
    }
}