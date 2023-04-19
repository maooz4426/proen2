import java.util.*;

public class DoubleStack {

    private double[] dataArray; // データに格納する配列
    private int sp; // スタックポインタ＝格納されているデータの個数
    private int doubleStackSize;// スタックの容量

    DoubleStack(int maxSize) {

        // double型の配列を初期化
        dataArray = new double[maxSize];
        sp = 0;
        doubleStackSize = maxSize;

    }

    public boolean isFull() {

        if (dataArray.length == 0) {// 要素数が０の時

            return false;

        } else if (sp == doubleStackSize) {

            return true;

        } else {

            return false;

        }

    }

    public boolean isEmpty() {

        if (sp == 0) {

            return true;

        } else {

            return false;

        }
    }

    public int size() {

        int size = sp;

        System.out.println(size);

        return size;
    }

    public void show() {

        System.out.println(Arrays.toString(dataArray));

    }

    public void push(double data) {

        if (this.isFull() == true) {

            System.err.println("スタックがいっぱいです。");

        } else {

            this.dataArray[sp++] = data;

        }
    }

    public double pop() {

        if (this.isEmpty() == true) {

            System.err.println("スタックが空です");

            return Double.NaN;

        } else {

            double dataPop = this.dataArray[--sp];

            this.dataArray[sp] = 0;

            return dataPop;

        }
    }

    public void clear() {

        while (!this.isEmpty()) {

            this.pop();

        }
    }

    public void extend(int size) {

        int exDoubleSize = doubleStackSize + size;

        DoubleStack exDoubleStack = new DoubleStack(exDoubleSize);

        for (int i = 0; i < sp; i++) {

            exDoubleStack.dataArray[i] = this.dataArray[i];

        }

        this.dataArray = exDoubleStack.dataArray;

    }

    public void extendPush() {

    }
}
