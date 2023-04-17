public class DoubleStack {

    private double[] dataArray; // データに格納する配列
    private int sp; // スタックポインタ＝格納されているデータの個数

    DoubleStack(int maxSize) {

        // double型の配列を初期化
        dataArray = new double[maxSize];
        sp = maxSize;

    }

    public boolean isFull() {

        if (sp == 0) {// 要素数が０の時、空であり、dataArray==spとすると空でもtureになる

            System.out.println("false");
            return false;

        } else if (dataArray.length == sp) {

            System.out.println("true");
            return true;

        } else {

            System.out.println("false");
            return false;

        }

    }

    public boolean isEmpty() {

        if (dataArray.length == 0) {

            System.out.println("true");
            return true;

        } else {

            System.out.println("false");
            return false;

        }
    }

    public int size() {

        int size = dataArray.length;

        System.out.println(size);

        return dataArray.length;
    }

    public void show() {

        for (int i = 0; i < sp; i++) {

            System.out.println(dataArray[i]);

        }

    }

}
