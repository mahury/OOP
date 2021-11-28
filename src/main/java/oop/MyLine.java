package oop;

public class MyLine {
    public MyPoint pointStart;
    public MyPoint pointEnd;

    public MyLine(int xs, int ys, int xe, int ye) {
        this.pointStart = new MyPoint(xs,ys);
        this.pointEnd = new MyPoint(xs,ys);

//        this.pointStart.x = xs;
//        this.pointStart.y = ys;
//        this.pointEnd.x = xe;
//        this.pointEnd.y = ye;
    }


//    public MyLine(MyPoint pointStart, MyPoint pointEnd) {
//        this.pointStart = pointStart;
//        this.pointEnd = pointEnd;
//    }

    class MyPoint{
        public int x;
        public int y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }


}
