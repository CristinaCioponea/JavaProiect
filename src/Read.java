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

}
