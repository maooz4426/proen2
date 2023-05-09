
public class DoubleQueue {

    private double dataArray[];
    private int maxSize;
    private int front;
    private int rear;
    private boolean fjudge = false;// isFull()の状態判別で使用
    private boolean ejudge = false;// isEmpty()の状態判別で使用

    DoubleQueue(int maxSize) {

        dataArray = new double[maxSize + 1];

        this.maxSize = maxSize;
        front = rear = 0;

    }

    private int next(int a) {

        int result = (a + 1) % (maxSize);

        return result;

    }

    public boolean isEmpty() {

        if (rear == front) {

            return true;

        } else {

            return false;

        }
    }

    public boolean isFull() {

        if (next(rear) == front) {

            return true;

        } else {

            return false;

        }

    }

    public int size() {

        if (front > rear) {

            return (maxSize - front) + rear + 1;

        } else if (fjudge == true) {

            return maxSize;

        } else {

            return rear - front + 1;
        }

    }

    public void show() {

        for (int i = 0; i < maxSize; i++)

            System.out.println("Array" + "[" + i + "]:=" + this.dataArray[i]);

    }

    public void enqueue(double data) {

        if (!fjudge) {

            fjudge = this.isFull();

            this.dataArray[rear] = data;

            System.out.println(this.dataArray[rear] + "を挿入");

            rear = next(rear);

        } else {

            System.err.println("キューがいっぱいです");

        }

    }

    public void dequeue() {

        if (!ejudge) {

            System.out.println(this.dataArray[front] + "を取り出した");
            this.dataArray[front] = 0;
            front = next(front);
            ejudge = this.isEmpty();
            fjudge = false;// fullだった場合リセットするため

        } else {

            System.err.println("キューが空です");

        }
    }

    public void clear() {

        while (!ejudge) {

            this.dequeue();

        }
        front = rear = 0;
    }

}
