public class test {

    public static void main(String[] args) {

        DoubleStack testStack = new DoubleStack(5);
        // 適当にスタックにデータを5個追加
        for (int i = 0; i < 5; i++) {
            testStack.push(i * 0.5 + 1);
        }
        // 現在のスタックを表示
        testStack.show();
        System.out.println("格納データ数 : " + testStack.size());
        testStack.extend(10);
        testStack.show();

    }

}
