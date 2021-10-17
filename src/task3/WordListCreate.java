package task3;

import java.util.Arrays;
import java.util.Scanner;

public class WordListCreate {



    public static Word [] wordsArrayCreator (String [] strings){

        Word [] words = new Word[strings.length];

        for (int i = 0; i < strings.length; i++){

            words[i] = new Word(strings[i]);
            //words[i].print();
        }
        System.out.println();
        Arrays.sort(words);

        for (int i = 0; i < words.length; i++){

            words[i].print();
        }

        return words;
    }

    public static void enterString() {
        System.out.print("Enter words: ");
        Scanner scan = new Scanner(System.in);
        String s =scan.nextLine();
        //String s = "Мама мел мило ёж кушал юла ямочка молоко клёцки";

        String [] st = s.split(" ");

        Word [] words = wordsArrayCreator (st);
    }
}
