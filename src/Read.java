import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public Float getFloat() {
        float number = 0f;
        boolean repeat;
        Scanner scann = new Scanner(System.in);
        do {
            try {
                System.err.print(" ");
                number = scann.nextFloat();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.err.print("No valid! " + scann.next());
                repeat = true;

            }
        } while (repeat);
        return number;
    }
    //1.In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura
    public int tratat(){
        int x = 0;
        boolean repeat;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Just a number");
                x = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.err.print("Not a number ");
                repeat = true;
            }
        }while (repeat == true);

        return x;
    }
    // 3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
    // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.
    public int [] array() {
        int number = 0;
        Scanner scan = new Scanner(System.in);
        try {
            int[] myArray = new int[] {2,3,4,5};
            System.out.println(myArray[scan.nextInt()]);
        } catch (IndexOutOfBoundsException exception){
            System.out.println("There is no position for that value! ");
        }catch (InputMismatchException exception){
            System.out.println("You have entered an incorrect value! ");
        }
        return new int[0];
    }
//4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
// Metoda nu va primi parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
// (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)
    public int [] populateArray() {
    int x = 0;
        int[] simplyArray = new int[100];
        boolean retry;
        do {
            try {
                Scanner scannn = new Scanner(System.in);
                x = scannn.nextInt();
                retry = false;
                System.out.println(simplyArray[scannn.nextInt()]);
            } catch (InputMismatchException exception) {
                System.out.println("Incorrect value ");
                retry = true;
            }
        }while (retry);


        return simplyArray;
    }



}
