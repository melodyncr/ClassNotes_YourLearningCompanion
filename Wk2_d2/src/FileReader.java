import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Author: Melody Neely
 * Date: 1 - Feb - 2023
 * Description: A Class tp show how to use Scanner.
 * Notes:
 * ctrl hover over a word to know what to do
 * Code/Reformat code (ctrl + alt + l)
 */
public class FileReader {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String filename = "myFile.txt";
        // if you change the name it will create a new file
        // information will not change but, will append when reloaded
        File f = new File(filename);
        Scanner fileIn = null;

        boolean loop = true;

        try {
            fileIn = new Scanner(f);
            if (f.createNewFile()) {
                System.out.println(filename + " created successfully!");
            } else {
                System.out.println(filename + " already exists.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("couldn't find the file...");
            System.out.println("Even though we created it?" + e);
        } catch (IOException e) {
            System.out.println("Problem arose when creating " + filename);
            e.printStackTrace();
        }
        
//        private void listing(){
//            
//        }
//        String input = null;
//        String arr = Arrays.toString(input.split(","));
//        

        while (fileIn != null && fileIn.hasNext()) {
            String input = fileIn.nextLine();
            System.out.println(input);
            //fileReader.listing();
        }

//        while (loop) {
//            System.out.println("Enter something (zz to exit)");
//            String input = scan.nextLine();
//
//            if (input.trim().equalsIgnoreCase("zz")) {
//                loop = false;
//                continue; //or break;
//            }
//            System.out.println("You entered " + input);
//        }

        //System.out.println("4"+2);

    }
}//end of class
