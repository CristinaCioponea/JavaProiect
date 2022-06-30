public class Main4 {
    public static void main(String[] args) {
        int x = 31;
        int y = 29;
        for (int i = x; i >= y; i--) {
            System.out.println(i);
        }
        for (int i = 3; i > 1; i--) {
            System.out.println("The value of i is: " + i);
        }
        LogicalOp op = new LogicalOp();
        op.evenNumbers();
        op.oddNumbers();
        int sumNumbers = op.sumNumbers();
        System.out.println(" Suma numerelor de la 36 la 100 este " + sumNumbers);
        double sumAndAverage = op.sumAndAverage();
        System.out.println("Media numerelor adunate de la 36,100 este " + sumAndAverage);
        double countAndAverage = op.countAndAverage(36,100);
        System.out.println("Media numerelor adunare de la 36 la 100 var 2 este " + countAndAverage);
        op.countNumbers();
        op.numberGreaterThan();
        op.tipar();
        // TEMA 12 - WHILE
        op.verifyCountandAverage();
        op.verifyCountNegative(-85, -100);

        }
    }


















