
public class DoubleQueue {

    private double dataArray[];
    private int maxSize;
    int front;
    int rear;

    DoubleQueue(int maxSize) {

        dataArray = new double[maxSize + 1];
        this.maxSize = maxSize;
        front = rear = 0;

    }

    private int next(int a) {

        return (a + 1) % maxSize;

    }

    public boolean isEmpty() {

        if (rear == front) {

            return true;

        } else {

            return false;

        }
    }

    public boolean isFull() {

        if (rear == maxSize) {

            return true;

        } else {

            return false;

        }
    }

    public int size() {

        return rear;

    }

    public void show() {

        String s = "[";

        for (int i = front; i < rear; i++) {

            s += this.dataArray[i] + " ";

        }

        s += "]";

        System.out.println(s);

    }

    public void enqueue(double data) {

        if (!this.isFull()) {

            this.dataArray[rear++] = data;

        } else {

            System.err.println("キューがいっぱいです");
        }

    }

    public void dequeue() {

        if (!this.isEmpty()) {

            int qp = front + 1;
            for (int i = front; i < rear; i++) {

                this.dataArray[front] = this.dataArray[qp++];

            }

            rear--;// 奥に詰めるのでrearを下げる

        } else {

            System.err.println("キューが空です");

        }
    }

    public void clear() {

        while (!this.isEmpty()) {

            this.dequeue();

        }
        front = rear = 0;
    }

}
