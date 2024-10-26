public class MainOPP210 {
    public static void main(String[] args) {

        MyPointOPP210 topLeft = new MyPointOPP210(1, 4);
        MyPointOPP210 bottomRight = new MyPointOPP210(5, 1);


        MyRectangleOPP210 rectangle = new MyRectangleOPP210(topLeft, bottomRight);


        System.out.println(rectangle);  
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
    }
}
