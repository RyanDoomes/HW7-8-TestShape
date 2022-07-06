public class Sentence {
    private String sentence;

    public Sentence(String x){
        this.sentence = x;
    }

    public String getSentence(){
        return this.sentence;
    }

    @Override
    public boolean equals(Object x){
        if(x==this.sentence){
            return true;
        }else {
            return false;
        }

    }
}
