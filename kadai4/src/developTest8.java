public class developTest8 {

    public static void main(String args[]) {
        DoubleQueue testQueue = new DoubleQueue(5);
        // 待ち行列にデータを5個追加
        for (int i = 0; i < 5; i++) {
            testQueue.enqueue(i * 0.5 + 1);
        }

        System.out.println("testQueue");

        testQueue.extend(2);
        testQueue.show();

        System.out.println("");

        DoubleQueue testQueue2 = new DoubleQueue(5);
        // 待ち行列にデータを5個追加
        for (int i = 0; i < 5; i++) {
            testQueue2.enqueue(i * 0.5 + 1);
        }

        System.out.println("testQueue2");
        testQueue2.extendEnqueue(3);
        testQueue2.show();

    }

}
