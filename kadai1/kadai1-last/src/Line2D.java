public class Line2D {

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