public class Main2 {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 7;
        int z = firstNumber + secondNumber;
        int y = firstNumber - secondNumber;
        int x = (firstNumber + secondNumber) / 2;
        System.out.println("Suma numerelor este = " + z);
        System.out.println(" Media numerelor este = " + x);
        System.out.println("Diferenta numerelor este = " + y);

        System.out.println(sum());
        System.out.println(substract(10.8, 5.3));
        System.out.println(firstNumber * secondNumber);
        System.out.println(secondNumber / firstNumber);
        System.out.println(distract(64, 12, 2));
        System.out.println(distance());
    }

    public static int sum() {
        int s = 18 + 18;
        return s;
    }

    public static double substract(double j, double k) {
        return j - k;
    }

    public static double distract(double h, double k, double l) {
        return h / k * l;
    }

    public static float distance() {
        float distanceMeter = 128;
        float time = 81222f;
        float distanceKm = distanceMeter * 1000;
        float distanceMille = distanceMeter * 1609;
        return distanceKm;

    }
}