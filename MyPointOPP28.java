public class MyPointOPP28 {
    public int x;
    public int y;
    public MyPointOPP28() {
       this.x = 0;
       this.y = 0;
    }

    public MyPointOPP28(int x, int y) {
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
    public double distance(MyPointOPP28 point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }
    public String toString() {
        return "center[x=" + x + ", y=" + y + "]";

    }

}
