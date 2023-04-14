public class Ex0202 {
    static class Point2D {

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

        public static void main(String[] args) {
            Point2D p1, p2;
            p1 = new Point2D(10.0, 20.0);
            p2 = new Point2D(20.0, 30.0);
            p1.print();
            p2.print();
            p2 = p1; // p2 に p1 を代入←参照先がp1になるため、p1の値が変更されると、p2がp1と同じになる
            p2.setX(100.0); // p2 の X 座標を変更
            // p1,p2 を表示すると
            p1.print();
            p2.print();
        }
    }
}
