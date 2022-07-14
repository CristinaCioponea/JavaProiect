import java.util.ArrayList;
import java.util.List;

public class LogicalOperations {


    public static void myListofNumbers() {
        //8. Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista,

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

    //10. Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista,
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
    // 9. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea



}



