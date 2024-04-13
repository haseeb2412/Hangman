import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("hello haseeb world");


        //  ---- Hangman game ------------
        try {
            Scanner scanner = new Scanner(new File("/home/rafiq/Desktop/words.txt"));

            List<String> words = new ArrayList<>();

            while (scanner.hasNextLine()) {
                words.add(scanner.nextLine());
            }
            Random rand = new Random();

            String word = words.get(rand.nextInt(words.size()));
            System.out.println(word);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("not file any file"+e);
        }



    }
}