public class Word extends Sentence{
    private String noVowelsWord;

    public Word(String s,String w){
        super(s);
        this.noVowelsWord = w.replaceAll("[aeiou]", "");
    }

    public String getNoVowelsWord(){
        return this.noVowelsWord;
    }

    public boolean isSubstring(){

        return getSentence().contains(this.noVowelsWord);
    }


}
