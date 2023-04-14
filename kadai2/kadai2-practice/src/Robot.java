public class Robot implements Cloneable {

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

    public Robot makeClone2() {
        // positonだけ別のインスタンスを生成する
        Position position2 = new Position(position.x, position.y);
        return new Robot(position2, this.name + "クローン");
    }

}
