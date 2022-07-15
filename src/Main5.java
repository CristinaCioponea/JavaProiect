public class Main5 {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        int[] myArray = op.populateArrayUpToNumber(100);
      op.printArray(myArray);


        int [] evenArray = op.getEvenArrayToHundred(100);
        op.getEvenArrayToHundred(evenArray);
        System.out.println(op.getEvenArrayToHundred(evenArray));





    }
}
