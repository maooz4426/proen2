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

    public Point2D clone() {
        double xClone = this.x;
        double yClone = this.y;
        return new Point2D(xClone, yClone);
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

        public Line2D clone() {

            Point2D xClone = this.p1.clone();
            Point2D yClone = this.p2.clone();
            return new Line2D(xClone, yClone);

        }

        public boolean equals(Line2D ln) {

            if (p1 == ln.p1 && p2 == ln.p2) {

                return true;

            } else {

                return false;

            }

        }
    }

    public static void main(String[] args) {

        Point2D p1 = new Point2D(10, 20);
        Point2D p2 = new Point2D(30, 40);
        Point2D p3 = new Point2D(50, 60);
        Line2D l1 = new Line2D(p1, p2);
        Line2D l2 = new Line2D(p1, p2);
        Line2D l3 = new Line2D(p1, p3);
        System.out.println("l1, l2 = " + l1.equals(l2));
        System.out.println("l2, l1 = " + l2.equals(l1));
        System.out.println("l1, l3 = " + l1.equals(l3));
    }
}