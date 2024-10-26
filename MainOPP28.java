public class MainOPP28 {
    public static void main(String[] args) {
        MyCircleOPP28 circle1 = new MyCircleOPP28(3, 4, 5);
        MyCircleOPP28 circle2 = new MyCircleOPP28(new MyPointOPP28(7,1),3);

        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println("Area of circle: " + circle1.getArea());
        System.out.println("Circumference of circle: " + circle1.getCircumference());

        System.out.println("Distance between circle1 and circle2: "+ circle1.distance(circle2));

    }
}
