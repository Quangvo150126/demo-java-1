public class MyRectangleOPP210 {
    private MyPointOPP210 topLeft;
    private MyPointOPP210 bottomRight;

    public MyRectangleOPP210(MyPointOPP210 topLeft, MyPointOPP210 bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public int getArea() {
        return getWidth() * getHeight();
    }


    public String toString() {
        return "MyRectangle(Top Left: " + topLeft + ", Bottom Right: " + bottomRight + ")";
    }

}
