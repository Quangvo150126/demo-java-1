public class MyPointOPP27 {
    private int x ,y;
    public MyPointOPP27(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;

    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public double distance(int x, int y) {
        int xDiff = x - this.x;
        int yDiff = y - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double distance(){
        return distance(x, y);
    }
}
