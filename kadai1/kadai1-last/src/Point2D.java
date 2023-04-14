public class Point2D {

    double x;
    double y;

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
}
