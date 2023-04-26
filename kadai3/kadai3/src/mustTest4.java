public class mustTest4 {

    public static void main(String args[]) {

        // DoubleStackのインスタンスを生成(サイズは5で)
        DoubleStack testStack = new DoubleStack(5);
        // スタックにデータを5個追加
        for (int i = 0; i < 5; i++) {
            testStack.push(i * 0.5 + 1);
        }
        // 現在のスタックを表示
        testStack.show();

        // さらにスタックに追加すると？
        testStack.push(5);

        testStack.show();
    }
}
