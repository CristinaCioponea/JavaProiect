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

        return 0;
    }

}
