public class TestEx0205 {
    /*
     * 位置
     */
    public static class Position {

        private int x; // X座標
        private int y; // Ｙ座標

        /*
         * 位置を生成する
         * 
         * @param x X座標
         * 
         * @param y Y座標
         */
        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        /*
         * X方向にxDeltaだけ移動する
         * 
         * @param xDelta X方向の移動量
         */
        public void moveX(int xDelta) {
            x += xDelta;
        }

        /*
         * Y方向にyDeltaだけ移動する
         * 
         * @param yDelta Y方向の移動量
         */
        public void moveY(int yDelta) {
            y += yDelta;
        }

        /*
         * X方向にxDelta、Y方向にyDeltaだけ移動する
         * 
         * @param xDelta X方向の移動量
         * 
         * @param yDelta Y方向の移動量
         * 
         */
        public void moveXY(int xDelta, int yDelta) {
            x += xDelta;
            y += yDelta;
        }

        /*
         * X座標を得る
         * 
         * @return X座標
         */
        public int getX() {
            return x;
        }

        /*
         * Y座標を得る
         * 
         * @return Y座標
         */
        public int getY() {
            return y;
        }

        /*
         * 位置を表す文字列を返す
         * 
         * @return 位置を表す文字列
         */
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    /*
     * ロボット
     */
    public static class Robot {

        private Position position;
        private String name;

        /*
         * ロボットを生成する
         * 
         * @param positon ロボットのいる位置
         * 
         * @param name ロボットの名前
         */
        public Robot(Position position, String name) {
            this.position = position;
            this.name = name;
        }

        /*
         * X方向にxDeltaだけ移動する
         * 
         * @param xDelta X方向の移動量
         */
        public void moveX(int xDelta) {
            position.moveX(xDelta);
        }

        /*
         * Y方向にyDeltaだけ移動する
         * 
         * @param yDelta Y方向の移動量
         */
        public void moveY(int yDelta) {
            position.moveY(yDelta);
        }

        /*
         * X方向にxDelta、Y方向にyDeltaだけ移動する
         * 
         * @param xDelta X方向の移動量
         * 
         * @param yDelta Y方向の移動量
         * 
         */
        public void moveXY(int xDelta, int yDelta) {
            position.moveXY(xDelta, yDelta);
        }

        /*
         * ロボットの名前を得る
         * 
         * @return ロボットの名前
         */
        public String getName() {
            return name;
        }

        /*
         * ロボットの位置を得る
         * 
         * @return ロボットの位置
         */
        public Position getPosition() {
            return position;
        }

        /*
         * ロボットの情報を表す文字列を得る
         * 
         * @return ロボットの情報
         */
        public String toString() {
            return "name:" + name + " positon:" + position.toString();// toString()を追加して対応
        }

        /*
         * ロボットのクローンを作成
         * 
         * @return ロボットのクローン
         * 
         */

        public Robot makeClone1() {
            return new Robot(this.position, this.name + "クローン");
        }

    }

    public static void main(String[] args) {
        Robot robita = new Robot(new Position(10, 20), "ロビタ");
        System.out.println("[Start]");
        Robot robitaMkII = robita.makeClone1();
        System.out.println("移動前の robita = " + robita);
        robita.moveX(10);
        System.out.println("移動後の robita = " + robita);
        System.out.println("robitaMkII = " + robitaMkII);
        System.out.println("[Goal]");
    }
}
