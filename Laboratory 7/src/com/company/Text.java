package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.toMap;

public class Text {

    public static int getSentences(String st) {
        int nrOfSentences=0;
        for (int i = 0; i < st.length(); i++) {
            Character c = st.charAt(i);
            if (c.equals('.')) nrOfSentences++;
        }
        return nrOfSentences;
    }

    public static int getWords(String st){
        int nrOfWords=1;
        for(int i = 0; i < st.length(); i++) {
            Character c = st.charAt(i);
            if (c.equals(' ')) nrOfWords++;
        }
        return nrOfWords;
    }

    public static int getLetters(String st){
        int nrOfCharacters=0;
        for(int i = 0; i < st.length(); i++) {
            nrOfCharacters++;
            Character c = st.charAt(i);
            if (c.equals('.') || c.equals(' ')) nrOfCharacters--;
        }
        return nrOfCharacters;
    }

    public static int getVowels(String st){
        int vowels=0;
        for(int i = 0; i < st.length(); i++) {
            Character c = st.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') {
                vowels++;
            }
        }
        return vowels;
    }
    public static int getConsonants(String st){

        int consonants=0;
        for(int i = 0; i < st.length(); i++) {
            Character c = st.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i'
                    || c == 'o' || c == 'u') {
            }
            else if((c >= 'a'&& c <= 'z')) {
                consonants++;
            }
        }
        return consonants;
    }

    public static void printTopWords(String st, int maxNr){
        //create map with value to show the nr of times the text is in the string
        Map<String,Integer> words = new HashMap<>();
        String[] roll = st.split("\\s+");
        for (final String word : roll) {
            Integer qty = words.get(word);
            if (qty == null) {
                qty = 1;
            } else {
                qty = qty + 1;
            }
            words.put(word, qty);
        }

        //sort map descening by Value
        Map<String, Integer> sorted = words

                .entrySet()

                .stream()

                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))

                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        //print top 'maxNr' words
        int counter = 0;
        for(final String word : sorted.keySet() ){
            if (counter==maxNr) break;
            counter++;
            int nr = sorted.get(word);
            System.out.println("'"+word+"' appears "+nr+" times;");
        }
    }
}
