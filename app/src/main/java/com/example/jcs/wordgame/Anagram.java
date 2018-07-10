package com.example.jcs.wordgame;

import java.io.IOException;
import java.util.Random;

public class Anagram {
    public static final Random RANDOM = new Random();
    public static String [] WORDS;
    String [] train()
    {
        ReadFile rf = new ReadFile();

        // The text file location of your choice
        String filename = "words.txt";

        try
        {
              WORDS = rf.readLines(filename);
            return WORDS;
        }
        catch(IOException e)
        {
            // Print out the exception that occurred
            System.out.println("Unable to create "+filename+": "+e.getMessage());
            return null;
        }

    public static String randomWord(){
        {return WORDS[RANDOM.nextInt(WORDS.length)];}

    public static String shuffleWord(String word) {
        if (word != null  &&  !"".equals(word)) {
            char a[] = word.toCharArray();

            for (int i = 0; i < a.length; i++) {
                int j = RANDOM.nextInt(a.length);
                char tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }

            return new String(a);
        }

        return word;
    }
}
