public class MyCircleOPP28 {
    private MyPointOPP28 center;
    private int Radius;
    public MyCircleOPP28() {
        this.Radius = 1;
    }
    public MyCircleOPP28(int x, int y, int radius) {
        this.center = new MyPointOPP28(x, y);
        this.Radius = radius;

    }
    public MyCircleOPP28(MyPointOPP28 center, int radius){
        this.center = center;
        this.Radius = radius;

    }
    public  int getRadius() {
        return Radius;

    }
    public void setRadius(int radius) {
        Radius = radius;
    }
    public MyPointOPP28 getCircle() {
        return center;
    }
    public void setCircle(MyPointOPP28 circle) {
        this.center = circle;
    }
    public int getCenterX() {
        return center.getX();
    }
    public int getCenterY() {
        return center.getY();
    }
    public void setCenterX(int x) {
        center.setX(x);
    }
    public void setCenterY(int y) {
        center.setY(y);
    }
    public int[] getCenterXY(){
        return getCenterXY();
    }
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    public String toString(){
        return "MyCircleOPP28[radius="+ Radius +", Center= "+ center +"]";
    }
    public double getArea() {
        return Math.PI * Radius * Radius;
    }


    public double getCircumference() {
        return 2 * Math.PI * Radius;
    }


    public double distance(MyCircleOPP28 another) {
        return center.distance(another.center);
    }



}
