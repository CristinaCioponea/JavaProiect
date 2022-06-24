public class Main3 {
    public static void main(String[] args) {
        String textNew = "FastTrackIt";
        if (textNew.equals("FastTrackIt")) {
            System.out.println("Learning text comparison" + textNew);
        } else if (!textNew.equals("FastTrackIt")) ;
        {
            System.out.println("Got to try some more" + textNew);
        }
            LogicalOp op = new LogicalOp();
            int biggest = op.checkBiggerNumber(7,3);
            System.out.println("The bigger number is: " + biggest);
    }



}
