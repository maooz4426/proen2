public class mustTest5 {

    public static void main(String args[]) {

        DoubleQueue testQueue = new DoubleQueue(5);
        for (int i = 0; i < 5; i++) { // データを5個追加
            testQueue.enqueue(i * 0.5 + 1);
        }
        testQueue.show();
        for (int i = 0; i < 2; i++) { // データを2個取り出し
            testQueue.dequeue();
        }
        testQueue.show();
        for (int i = 0; i < 2; i++) { // データを2個追加
            testQueue.enqueue(i * 0.5 + 5);
        }
        testQueue.show();
        for (int i = 0; i < 5; i++) { // データを5個取り出し
            testQueue.dequeue();
        }
        // さらにデータを取り出すと？
        testQueue.dequeue();
    }

}
