public class MyTriangleOPP29 {
    private MyPointOPP29 v1;
    private MyPointOPP29 v2;
    private MyPointOPP29 v3;

    public MyTriangleOPP29(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPointOPP29(x1,y1);
        this.v2 = new MyPointOPP29(x2,y2);
        this.v3 = new MyPointOPP29(x3,y3);
    }
    public MyTriangleOPP29(MyPointOPP29 v1, MyPointOPP29 v2, MyPointOPP29 v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;

    }
    public String toString(){
        return "MyTriangleOPP29[v1="+ v1 +",v2="+ v2 +",v3="+ v3 +"]";

    }
    public double getPerimeter(){
        double side1 = this.v1.distance(v2);
        double side2 = this.v2.distance(v3);
        double side3 = this.v3.distance(v1);
        return side1 + side2 + side3;


    }
    public void getType() {
        double side1 = this.v1.distance(v2);
        double side2 = this.v2.distance(v3);
        double side3 = this.v3.distance(v1);

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");

        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

    }
}
