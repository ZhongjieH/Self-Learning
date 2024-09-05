package Model;

public class Word {

    private String word_english;
    private final String word_Mandarin;
    private final String[] exampleSentences;
    private final int difficulty;

    public String getWord_english() {
        return word_english;
    }
    public String getWord_Mandarin() {
        return word_Mandarin;
    }
    public String[] getExampleSentences() {
        return exampleSentences;
    }
    public int getDifficulty() {
        return difficulty;
    }

    public void setWord_english(String word_english) {
        this.word_english = word_english;
    }

    public Word(String word_english, String word_Mandarin, String[] exampleSentences, int difficulty) {
        this.word_english = word_english;
        this.word_Mandarin = word_Mandarin;
        this.exampleSentences = exampleSentences;
        this.difficulty = difficulty;
    }

}
