public class MyLineOPP27 {
    private MyPointOPP27 begin;
    private MyPointOPP27 end;

    public MyLineOPP27(int x1, int y1, int x2, int y2) {
        begin = new MyPointOPP27(x1, y1);
        end = new MyPointOPP27(x2, y2);
    }
    public MyLineOPP27 (MyPointOPP27 begin, MyPointOPP27 end) {
        this.begin = begin;
        this.end = end;
    }
    public MyPointOPP27 getBegin() {
        return begin;
    }
    public void setBegin(MyPointOPP27 begin) {
        this.begin = begin;
    }
    public MyPointOPP27 getEnd() {
        return end;
    }
    public void setEnd(MyPointOPP27 end) {
        this.end = end;
    }
    public int getBeginX(){
        return begin.getX();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public int getBeginY(){
        return begin.getY();
    }
    public void setBeginY(int y){
        begin.setY(y);
    }
    public int getEndX(){
        return end.getX();
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public int getEndY(){
        return end.getY();
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public int getBeginXY(){
        return getBeginXY();

    }
    public void setBeginXY(int x,int y){
        begin.setX(x);
        begin.setY(y);
    }
    public int getEndXY(){
        return getEndXY();

    }
    public void setEndXY(int x,int y){
        end.setX(x);
        end.setY(y);

    }
    public double getLength(){
        return begin.distance();


    }
    public double getGradient(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString(){
        return "MyLineOPP27[begin=" + begin + ", end=" + end + "]";
    }






}
