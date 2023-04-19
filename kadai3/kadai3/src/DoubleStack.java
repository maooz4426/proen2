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

            System.out.println("true");
            return true;

        } else {

            System.out.println("false");
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

            this.dataArray[sp] = data;

            sp++;

        }
    }

}
