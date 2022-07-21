public class Main5 {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        int[] myArray = op.populateArrayUpToNumber(100);
       op.printArray(myArray);


        int [] evenArray = op.getEvenArrayToHundred(myArray);
        op.getEvenArrayToHundred(evenArray);
        System.out.println(op.getEvenArrayToHundred(evenArray));
        op.ScanArray(evenArray);





    }
}
