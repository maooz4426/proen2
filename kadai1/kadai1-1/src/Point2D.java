public class Point2D {

    private double x;
    private double y;

    // Point2Dのコンストラクタを定義
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public static void main(String[] args) {

        Point2D first = new Point2D(10, 2);
        System.out.println(first);

    }
}
