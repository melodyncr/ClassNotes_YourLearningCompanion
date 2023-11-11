import java.util.ArrayList;
import java.util.HashMap;
/**
 * Name: Melody Neely
 * Date: 2/26/23
 * Explanation:
 * The goal of the assigment is to learn to be comfortable with larger
 * projects using a test file. I found it difficult to achieve some of
 * the requirements of this project but, that's honestly on me for starting
 * late. However, I did try to implement some ideas into the code inorder
 * to show I did try to understand what to put in some of the methods.At
 * leaset, the basic idea of it.
 * */
public class Markov {
    private String ENDS_IN_PUNCTUATION;
    private String PUNCTUATION_MARKS;
    private final String prevWord;
    private HashMap<String, ArrayList<String>> words;


    public Markov() {
        HashMap<String,ArrayList<String>> words = new HashMap<String,ArrayList<String>>();
        words.put(ENDS_IN_PUNCTUATION, new ArrayList<String>());
        prevWord = ENDS_IN_PUNCTUATION;


    }

    public boolean endsWithPunctuation(String punc){

        return false;
    }

    public void addFromFile(String filename){
        try{


        }catch(Exception e){
            System.out.println("uh-oh something went wrong :(!");
        }

    }

    void addLine(String add){}

    String randomWord(String word){
        return word;
    }

    @Override
    public String toString() {
        return "List" + words;
    }

    public HashMap<String, ArrayList<String>> getWords() {
        return words;
    }

    void addWord(String word){
        if(!endsWithPunctuation(word)){
            //check if the prevWord has a entry
            if(getWords().containsKey(word)){
                //if not key, will be added as a key
            }else{
                //if a key in the HashMap, will use prevWord as a Key
                //in the Array list
            }
        }
        if(endsWithPunctuation(word)){
            //current word is added under ENDS_IN_PUNCTUATION key
            words.put(word, new ArrayList<String>);

        }

    }

    public String getSentence(){
        return null;
    }
}
