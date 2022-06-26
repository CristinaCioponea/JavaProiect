public class LogicalOp {

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }
    //   8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    //   Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie sa reprezinte numarul apasat.
    //   Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar
    //   pentru fiecare caz din Switch-Case.
    //   Apelati metoda in main() pentru a verifica daca functioneaza.

    int nr = 5;

    public int switchNumber(int nr) {
        switch (nr) {
            case 1:
                System.out.println(" This number is:" + 1);
                break;
            case 2:
                System.out.println(" This number is:" + 2);
                break;
            case 3:
                System.out.println(" This number is:" + 3);
                break;
            case 4:
                System.out.println(" This number is:" + 5);
                break;
            case 5:
                System.out.println(" This number is:" + 7);
                break;

        }
        return switchNumber(5);

    }
}










