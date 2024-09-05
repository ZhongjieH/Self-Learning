package Model;

import Model.Words.Words_ONE;
import Model.Words.Words_TWO;
import java.util.Objects;

public class GeneratingWords {

    public static void main(String[] args) {
        Words_ONE words_one = new Words_ONE();
        Words_TWO words_two = new Words_TWO();

        int numberOfWordsRepeated = 0;
        Word[] words = new Word[words_one.getNumberOfWords() + words_two.getNumberOfWords()];

        words_one.getWords(words);
        words_two.getWords(words);

        int wordID_repeated = 1, time_detected, wordIndex_detected, numberOfExampleSentences;
        for (Word word1 : words) {
            time_detected = 0;
            wordIndex_detected = 0;
            for (Word word2 : words) {
                if (Objects.equals(word1.getWord_english(), word2.getWord_english())) {
                    time_detected++;
                    if (time_detected >= 2) {
                        words[wordIndex_detected].setWord_english("该单词已重复!!! " + words[wordIndex_detected].getWord_english() + " " + wordID_repeated);
                        numberOfWordsRepeated++;
                        wordID_repeated++;
                    }
                }
                wordIndex_detected++;
            }
            System.out.println(word1.getWord_english());
            System.out.println(word1.getWord_Mandarin());
            numberOfExampleSentences = word1.getExampleSentences().length;
            if (numberOfExampleSentences > 0) {
                if (numberOfExampleSentences > 1) {
                    System.out.println("examples: " + word1.getExampleSentences()[0]);
                    for (int i = 1; i <= numberOfExampleSentences - 1; i++) {
                        System.out.println(word1.getExampleSentences()[i]);
                    }
                } else {
                    System.out.println("example: " + word1.getExampleSentences()[0]);
                }
            }
            System.out.println("------------------------------------------------------------------------------------" +
                    "----------------------------------------------");
        }

        System.out.println("重复的单词有: " + numberOfWordsRepeated + "个;");
    }

}
