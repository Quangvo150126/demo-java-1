public class MainOPP26 {
    public static void main(String[] args) {
        MyPointOPP26 p1 = new MyPointOPP26();
        System.out.println(p1);
        p1.setX(8);
        p1.setY(6);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);
        System.out.println(p1.getXY()[0]);
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPointOPP26 p2 = new MyPointOPP26(0,4);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());

        MyPointOPP26[] points = new MyPointOPP26[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPointOPP26();
        }
        for (MyPointOPP26 p : points) {
            System.out.println(p);
        }

    }
}
