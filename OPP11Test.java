public class OPP11Test {
    public static void main(String[] args) {
        OPP11 c1 = new OPP11();
        System.out.println("Circle c1 radius: " + c1.getRadius());
        System.out.println("Circle c1 area: " + c1.getArea());
        System.out.println("Circle c1 color: " + c1.getColor());

        // Test overloaded constructor
        OPP11 c2 = new OPP11(2.5);
        System.out.println("Circle c2 radius: " + c2.getRadius());
        System.out.println("Circle c2 area: " + c2.getArea());
        System.out.println("Circle c2 color: " + c2.getColor());

        // Test toString method
        System.out.println(c1);
        System.out.println(c2);
    }
}
