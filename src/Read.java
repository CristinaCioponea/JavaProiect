import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {

    public Float getFloat() {
        float number = 0f;
        boolean repeat;
        Scanner scann = new Scanner(System.in);
        do {
            try {
                System.out.println("Just a number ");
                number = scann.nextFloat();
                repeat = false;
            } catch (InputMismatchException exception) {
                System.err.println("No valid! " + scann.next());
                repeat = true;

            }
        } while (repeat);
        return number;

    }
}
