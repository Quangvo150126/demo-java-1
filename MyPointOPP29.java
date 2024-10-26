public class MyPointOPP29 {
    private int x;
    private int y;

    public MyPointOPP29(int x, int y) {
        this.x= x;
        this.y= y;

    }
    public int getX() {
        return x;
    }
    public void setx(int x){
        this.x= x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y){
        this.y= y;
    }
    public double distance(MyPointOPP29 point){
        return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    }
    public String toString(){
        return "MyPointOPP29 [x=" + x + ", y=" + y + "]";
    }

}
