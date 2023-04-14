import java.lang.Math;

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

    static class Line2D {

        private Point2D p1;
        private Point2D p2;

        public Line2D(Point2D p1, Point2D p2) {

            this.p1 = p1;
            this.p2 = p2;

        }

        public Point2D getP1() {

            return p1;

        }

        public Point2D getP2() {

            return p2;

        }

        public void print() {

            String pr1;
            String pr2;
            pr1 = p1.pointSet();
            pr2 = p2.pointSet();
            System.out.println(pr1 + " - " + pr2);

        }

        public void length() {

            double resultLength, resultX, resultY;

            resultX = Math.pow(p1.x - p2.x, 2);
            resultY = Math.pow(p1.y - p2.y, 2);

            resultLength = Math.pow(resultX + resultY, 0.5);

            System.out.print(resultLength);

        }

        public boolean isOn(Point2D p3) {
            if (p1.x != p2.x) {

                if (p3.x - p1.x == ((p2.y - p1.y) / (p2.x - p1.x)) * (p3.x - p1.x)) {

                    System.out.println("true");

                    return true;
                } else {

                    System.out.println("false");

                    return false;

                }
            } else {

                if (p3.x == p1.x) {

                    System.out.println("true");

                    return true;

                } else {

                    System.out.println("false");

                    return false;

                }
            }
        }
    }

    public static void main(String[] args) {

        Point2D first = new Point2D(10, 20);
        Point2D second = new Point2D(20.0, 30.0);
        Point2D third = new Point2D(15, 25);

        Line2D line = new Line2D(first, second);
        line.isOn(third);

    }
}
