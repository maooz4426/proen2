
public class DoubleQueue {

    private double dataArray[];
    private int maxSize;
    int front;
    int rear;

    DoubleQueue(int maxSize) {

        dataArray = new double[maxSize + 1];

        this.maxSize = maxSize + 1;
        front = rear = 0;

    }

    private int next(int a) {

        int result = (a + 1) % maxSize;

        return result;

    }

    private int restore(int a) {

        int result = a - 1;

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

        if (next(rear) == front) {// rearの次に数が入ってたら良い

            restore(rear);

            return true;

        } else {

            restore(rear);

            return false;

        }

    }

    public int size() {

        if (front > rear) {

            return (maxSize - front) + rear + 1;

        } else {

            return rear - front + 1;

        }

    }

    public void show() {

        String s = "[";

        for (int i = front; i != rear; next(i)) {

            s += this.dataArray[i] + " ";

        }

        s += "]";

        System.out.println(s);

    }

    public void enqueue(double data) {

        if (!this.isFull()) {

            this.dataArray[rear] = data;

            System.out.println(this.dataArray[rear] + "を挿入");

            next(rear);

        } else {

            System.err.println("キューがいっぱいです");

        }

    }

    public void dequeue() {

        if (!this.isEmpty()) {

            System.out.println(this.dataArray[front] + "を取り出した");
            this.dataArray[front] = 0;
            next(front);

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
