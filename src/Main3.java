public class Main3 {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(7, 3);
        System.out.println("The bigger number is: " + biggest);

        String returnTextNumber = op.returnTextNumber("FastTrackIT", 8);
        System.out.println(returnTextNumber);

        String checktext = op.checkText("FastTrackIt");
        System.out.println(checktext);

        String orCondition = op.orCondition(3);
        System.out.println(orCondition);

        String orCondition2 = op.orCondition2(8);
        System.out.println(orCondition2);

        String greaterThanEqalTo = op.greaterThanEqualTo(4);
        System.out.println(greaterThanEqalTo);

        int printNumber = op.printNumber(8);

        boolean isNumberEven = op.isNumberEven(7);
        System.out.println(isNumberEven);




    }


}

