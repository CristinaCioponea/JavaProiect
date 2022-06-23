import java.util.Scanner;

import static java.lang.System.in;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {

       double temperatura = 12;
        Scanner in = new Scanner(System.in);
        System.out.println("Temperatura in Celsius ");

        temperatura = in.nextDouble();
        temperatura = (temperatura * 9.0/5.0) + 32;

        System.out.println("Temperatura in Fahrenheit = " + temperatura);


    }
}
