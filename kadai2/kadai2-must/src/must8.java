public class must8 {

    public static void main(String[] args) {

        // 2-8
        Point2D p1 = new Point2D(10, 10);
        Point2D p2 = p1.clone(); // p2をクローン

        p2.setX(20); // p2のx座標を変更
        p1.print();
        p2.print();
        Line2D l1 = new Line2D(p1, p2);
        Line2D l2 = l1.clone(); // l1をクローン
        // l2の終点を(25,30)に変更
        l2.getP2().setX(25);
        l2.getP2().setY(30);
        l1.print();
        l2.print();

    }
}
