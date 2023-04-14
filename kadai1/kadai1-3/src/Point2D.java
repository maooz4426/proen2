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

    public static void main(String[] args) {

        Point2D first = new Point2D(10, 2);
        first.getX();
        first.getY();
        first.setX(20.0);
        first.setY(30.0);
        first.print();

    }
}
