public class developTest8 {

    public static void main(String args[]) {

        DoubleStack testStack = new DoubleStack(5);

        for (int i = 0; i < 5; i++) {
            testStack.push(i * 0.5 + 1);
        }

        testStack.show();

        testStack.extendPush(3);
        testStack.show();
        testStack.extend(2);
        testStack.show();

    }

}
