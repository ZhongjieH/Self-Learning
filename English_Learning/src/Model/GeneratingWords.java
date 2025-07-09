package Model;

import Model.Words.VerbForm;
import Model.Words.Words;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GeneratingWords {

    public static void main(String[] args) {
        Words words_one = new Words();

        Word[] words = new Word[words_one.getNumberOfWords()];

        words_one.getWords(words);

        int numberOfWordsRepeated = 0, numberOfExampleSentences, word1Index = 0, word2Index;
        List<StringIntPair> pairList = new ArrayList<>();

        for (Word word1 : words) {
            Integer minValue = getMinIntForString(pairList, word1.word_english());
            if (minValue != null && minValue == word1Index) {
                System.out.println("该单词已重复!!! " + words[word1Index].word_english());
                numberOfWordsRepeated++;
                deletePair(pairList, word1.word_english(), minValue);
                word1Index++;
                System.out.println("------------------------------------------------------------------------------------" +
                        "----------------------------------------------");
                continue;
            } else {
                word2Index = 0;
                for (Word word2 : words) {
                    if (Objects.equals(word1.word_english(), word2.word_english()) && word1Index != word2Index) {
                        pairList.add(new StringIntPair(word2.word_english(), word2Index));
                    }
                    word2Index++;
                }
                word1Index++;
            }

            if (word1.verb() != null) {
                System.out.println("原型, 三单, 过去式, 过去分词, 进行时");
                StringBuilder base = new StringBuilder(word1.verb().base()),
                        thirdPerson = new StringBuilder(word1.verb().thirdPerson()),
                        pastSimple = new StringBuilder(word1.verb().pastSimple()),
                        pastParticiple = new StringBuilder(word1.verb().pastParticiple()),
                        continuous = new StringBuilder(word1.verb().continuous());
                int lengthOfVerbForms = word1.verb().forms().length;
                for (int i = 0; i < lengthOfVerbForms; i++) {
                    switch (word1.verb().forms()[i]) {
                        case "BASE" -> base = new StringBuilder("(" + base + ")");
                        case "THIRDPERSON" -> thirdPerson = new StringBuilder("(" + thirdPerson + ")");
                        case "PASTSIMPLE" -> pastSimple = new StringBuilder("(" + pastSimple + ")");
                        case "PASTPARTICIPLE" -> pastParticiple = new StringBuilder("(" + pastParticiple + ")");
                        case "CONTINUOUS" -> continuous = new StringBuilder("(" + continuous + ")");
                    }
                }
                System.out.println(base + ", " + thirdPerson + ", " + pastSimple + ", " + pastParticiple + ", " + continuous);
                if (!Objects.equals(word1.verb().forms()[0], VerbForm.BASE.name())) {
                    for (Word word3 : words) {
                        if (Objects.equals(word3.word_english(), word1.verb().base())) {
                            System.out.println(word3.word_Mandarin());
                            break;
                        }
                    }
                } else {
                    System.out.println(word1.word_Mandarin());
                }
            } else {
                System.out.println(word1.word_english());
                System.out.println(word1.word_Mandarin());
            }
            numberOfExampleSentences = word1.exampleSentences().length;
            if (numberOfExampleSentences > 0) {
                if (numberOfExampleSentences > 1) {
                    System.out.println("examples: " + word1.exampleSentences()[0]);
                    for (int i = 1; i <= numberOfExampleSentences - 1; i++) {
                        System.out.println("          " + word1.exampleSentences()[i]);
                    }
                } else {
                    System.out.println("example: " + word1.exampleSentences()[0]);
                }
            }
            System.out.println("------------------------------------------------------------------------------------" +
                    "----------------------------------------------");
        }
        System.out.println("重复的单词有: " + numberOfWordsRepeated + "个;");
    }

    private static Integer getMinIntForString(List<StringIntPair> pairList, String key) {
        Integer minValue = null;
        for (StringIntPair pair : pairList) {
            if (pair.key().equals(key)) {
                if (minValue == null || pair.value() < minValue) {
                    minValue = pair.value();
                }
            }
        }
        return minValue;
    }

    private static void deletePair(List<StringIntPair> pairList, String key, int value) {
        for (int i = 0; i < pairList.size(); i++) {
            StringIntPair pair = pairList.get(i);
            if (pair.key().equals(key) && pair.value() == value) {
                pairList.remove(i);
                return;
            }
        }
    }

}
