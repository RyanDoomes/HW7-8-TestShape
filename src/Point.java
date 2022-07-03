public class Point {
    private int x;
    private int y;

/*    public Point(){
        this.x = 0;
        this.y = 0;
    }*/

    public Point(int xVal, int yVal) {
        this.x = xVal;
        this.y = yVal;
    }

    //getter methods
    public int getX() {

        return this.x;
    }

    public int getY() {
        return this.y;
    }

    //setter methods
 /*   public void setX(){
        this.x = x;
    }

    public void setY(){
        this.y = y;
    }*/

    public void setPoint(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public double distance(Point point) {
        double s1 = this.x - point.getX();
        double s3 = this.y - point.getY();
        return Math.sqrt(Math.pow(s1, 2) + Math.pow(s3, 2));
    }
}
