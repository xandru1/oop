package com.company;

import java.lang.*;

public class Main {

    public static void main(String[] args) throws Exception {
        String st = FileGetter.fileToString("C:\\Users\\Eliodor\\Desktop\\test.txt");
        System.out.println(st);
        System.out.println("\nNr of sentences: "+Text.getSentences(st));
        System.out.println("Nr of words: "+Text.getWords(st));
        System.out.println("Nr of letters: "+Text.getLetters(st));
        System.out.println("Nr of vowels: " + Text.getVowels(st));
        System.out.println("Nr of consonants " + Text.getConsonants(st));
        System.out.println("\nTop 5 words:");
        Text.printTopWords(st, 5);
    }

}
