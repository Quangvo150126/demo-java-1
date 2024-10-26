public class MainOPP27 {
    public static void main(String[] args) {
        MyLineOPP27 Line1 = new MyLineOPP27(0, 0, 0,0  );
        System.out.println(Line1);

        MyPointOPP27 p1 = new MyPointOPP27(1,2);
        MyPointOPP27 p2 = new MyPointOPP27(3, 4);
        MyLineOPP27 line2 = new MyLineOPP27(p1, p2);
        System.out.println(line2);


        MyLineOPP27 line3 = new MyLineOPP27(5, 6, 7, 8);
        System.out.println(line3);


        line3.setBegin(new MyPointOPP27(9, 10));
        line3.setEnd(new MyPointOPP27(11, 12));
        System.out.println(line3);

        System.out.println("Begin point: " + line3.getBegin());
        System.out.println("End point: " + line3.getEnd());


        line3.setBeginXY(13,14);
        line3.setEndXY(15, 16);
        System.out.println(line3);

        System.out.println("Begin X: " + line3.getBeginX());
        System.out.println("Begin Y: " + line3.getBeginY());
        System.out.println("End X: " + line3.getEndX());
        System.out.println("End Y: " + line3.getEndY());


        System.out.println("Length of line: " + line3.getLength());


        System.out.println("Gradient of line: " + line3.getGradient());
    }

    }

