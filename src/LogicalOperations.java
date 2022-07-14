import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogicalOperations {


    public static void myListofNumbers() {
        //1. Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista,

        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            myList.add(i);

        }
        myList.set(2, 7);
        myList.set(3, 8);
        myList.add(2, 7);
        myList.add(3, 8);


        System.out.println(myList);
    }

    //2. Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista,
    // care sa contina doar numerele pare din lista primita.
    public static List<Integer> myEvenNumbers() {
        List<Integer> myEven = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {

                myEven.add(i);

            }

        }
        return myEven;
    }
    // 3.Scrieti o metoda Java care sa primeasca parametru o Lista nesortata, si sa returneze Lista sortata crescator.
    // Atentie, sortarea sa se faca programatic(adica logica sa fie scrisa de voi),
    // si nu folosit librarie externa, precum Collection.sort().
    public static List<Integer> unsortedNumbers() {
        List<Integer> unsortedNumbers = new ArrayList<>();
        unsortedNumbers.add(1);
        unsortedNumbers.add(2);
        unsortedNumbers.add(8);
        unsortedNumbers.add(5);
        unsortedNumbers.add(3);

        for (int i = 0; i<=8; i++) {
            unsortedNumbers.add(i);
        }


        return unsortedNumbers;
    }

public static void numere () {
int numere [] = {1, 2, 8, 5, 3};
int s = numere.length;
for ( int i = 0; i < s; i++) {
    System.out.print(numere[i] + " ");
}
    System.out.println();
    Arrays.sort(numere);
    for (int i = 0; i < s; i++) {
        System.out.print(numere[i] + " ");
    }
}

}



