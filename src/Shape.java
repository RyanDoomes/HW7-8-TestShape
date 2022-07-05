public class Shape  {
//Shape is the parent class
    private boolean isFilled;

    private String color;

    public Shape(){

        isFilled = true;

        color = "green";

    }

    public Shape(boolean isFilled, String color ){

        this.isFilled = isFilled;

        this.color = color;

    }

    //getter
    public boolean getIsFilled(){
        return this.isFilled;
    }

    public String getColor(){
        return this.color;
    }

    //setter are always voids, because we are not returning anything
    public void setIsFilled(boolean isFilled){
        this.isFilled = isFilled;
    }

    public void setColor(String color){
        this.color  = color;
    }

    @Override //this is used to override the built-in method toString.
    public String toString(){
        return "Filled: " + this.isFilled + " \n" + "Color: " + this.color + "\n";
    }



}
