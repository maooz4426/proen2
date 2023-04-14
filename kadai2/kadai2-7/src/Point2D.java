public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {

        System.out.println("(" + x + ", " + y + ")");

    }

    public void getX() {

        System.out.println(x);

    }

    public void getY() {

        System.out.println(y);

    }

    public void setX(double x) {

        this.x = x;

    }

    public void setY(double y) {

        this.y = y;

    }

    public String pointSet() {
        String xP, yP;

        xP = String.valueOf(x);
        yP = String.valueOf(y);

        String p = "(" + xP + ", " + yP + ")";

        return p;

    }

    public Point2D clone() {
        double xClone = this.x;
        double yClone = this.y;
        return new Point2D(xClone, yClone);
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(10, 10);
        Point2D p2 = p1.clone(); // p2をクローン
        p2.setX(20); // p2のx座標を変更
        p1.print();
        p2.print();

    }
}