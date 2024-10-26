public class MainOPP29 {
    public static void main(String[] args) {
        MyTriangleOPP29 triangle1 = new MyTriangleOPP29(0, 0, 3, 0, 0, 4);
        MyTriangleOPP29 triangle2 = new MyTriangleOPP29(new MyPointOPP29(1, 1), new MyPointOPP29(4, 1),
                new MyPointOPP29(1, 5));


        System.out.println(triangle1);
        System.out.println(triangle2);


        System.out.println("Perimeter of triangle1: " + triangle1.getPerimeter());
        System.out.println("Perimeter of triangle2: " + triangle2.getPerimeter());


        triangle1.getType();
        triangle2.getType();

    }
}
