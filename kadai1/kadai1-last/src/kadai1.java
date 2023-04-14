public class kadai1 {

    public static void main(String[] args) {

        Point2D first = new Point2D(10, 20);
        Point2D second = new Point2D(20.0, 30.0);
        Point2D third = new Point2D(15, 25);

        Line2D line = new Line2D(first, second);
        line.isOn(third);

    }

}
