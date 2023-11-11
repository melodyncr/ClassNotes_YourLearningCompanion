import java.util.ArrayList;

/**
 * Name: Melody Neely
 * Date: 2/12/23
 * Explanation:
 * This class Jotto is part of a game where the user will be prompted
 * to guess a word that has been chosen.
 * */

public class Jotto {
    private final static int  WORD_SIZE = 0;
    private static String filename;
    private final static int DEBUG = 1;
    private static ArrayList<String> playedWords;
    private static ArrayList<String> wordList;
    private static ArrayList<String> playerGuesses;
    private String currentWord;
    private int score;


    public Jotto(String filepath) {
        filename = filepath;
        //readWord()
    }


}
