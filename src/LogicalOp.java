public class LogicalOp {
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String returnTextNumber(String text, int number) {
        if (text.equals("FastTrackIT ") && number <= 3) {
            return text + number;
        } else if (!text.equals("FastTrackIT ") && number >= 4) {
            return number + text;
        } else {
            return "Neither conditions are true";
        }
    }

    public String checkText(String text) {
        if (!text.equals("FastTrackIt")) {
            return "Learning text comparision.";
        } else {
            return "Got to try some more.";
        }
    }

    public String orCondition(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }

    }

    public String orCondition2(int number) {
        if (number > 10 || number == 12) {
            return " This it's it " + number;
        } else {
            return "No way " + number;

        }

    }

    public String greaterThanEqualTo(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) ;
        {
            return "The number is lower than 3";

        }

    }

    public int printNumber(int number) {
        switch (number) {
            case 0:
                System.out.println("The number os 0");
                break;
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            case 5:
                System.out.println("The number is 5");
                break;
            case 6:
                System.out.println("The number is 6");
                break;
            case 7:
                System.out.println("The number is 7");
                break;
            case 8:
                System.out.println("The number is 8");
                break;
            case 9:
                System.out.println("The number is 9");
                break;
            default:
                System.out.println("Not allowed");
        }
        return number;
    }

    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int number) {
        if (number >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int returnBiggestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }


    //TEMA 12 = for
    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    int x = 1;

    public void evenNumbers() {
        for (int i = x; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even numbers are " + i);
            }
        }
    }

    // 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void oddNumbers() {
        int x = 1;
        for (int i = x; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd numbers are " + i);
            }
        }
    }

    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100,
    // pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public int sumNumbers() {
        int sum = 0;
        int x = 36;
        for (int i = x; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    // 8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100,
// pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La final, metoda sa returneze media.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public double sumAndAverage() {
        int x = 36;
        int y = 100 - 36;
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum += i;
        }
        return sum / y;
    }

    public double countAndAverage(double first, double second) {
        double sum = 0;
        double count = 0;
        while (first <= second) {
            sum = sum + first;
            first++;
            count++;
        }
        return sum / count;

    }

    // 3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze
    // o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void countNumbers() {
        int x = 11;
        int y = 14;
        for (int i = x; i <= y; i++) {
            System.out.println(" Numerele cuprinse intre x si y sunt " + i);
        }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare
// de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
// daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void numberGreaterThan() {
        int x = 4;
        int y = 7;
        for (int i = x; i <= y; i++) {
            if (x <= y) {
                System.out.println("Ordinea crescatoare a numerelor este " + i);
            }
        }
        for (int i = y; i >= x; i--) {
            if (x <= y) {
                System.out.println("Ordinea descrescatoare a numerelor este " + i);

            }
        }
    }

    //9.Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    public void tipar() {
        for (int i = 10; i >= 1; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 10; i <= 10; ++i)
            System.out.println(i);
    }


    //TEMA 12 - WHILE
    public void verifyCountandAverage() {
        int x = 98;
        int sum = 0;
        double count = 0;
        while (x <= 100) {
            sum = sum + x;
            x++;
            count++;
        }
        System.out.println("Media sumei numerelor cuprinse intre 98 si 100 este " + sum / count);
    }

    //1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit,
    // si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru. Atentie la crearea
    // tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void verifyCountPositive(int start, int finish) {
        while (start <= finish) {
            if (start != 0) {
                System.out.println("Numaratoarea pozitiva este " + start);
                start++;
            }
        }
    }
    // 2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit,
// si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. Atentie la
// crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void verifyCountNegative() {
        int first = -97;
        int second = -100;
        while (first >= second) {
            if (first != 0) {
                System.out.println("Numaratoarea negativa este " + first);
                first--;
            }
        }
    }

    //5.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void whileEven() {
        int i = 20;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("Numar par este " + i);
            }
            i++;
        }
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o numaratoare
// intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex:
// daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void verifyCounterTwoNumbers() {
        int x = 8;
        int y = 12;
        while (x < y) {
            if (x != 0) {
                System.out.println("Verify if count two numbers is " + x);
            }
            x++;
        }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice care dintre
// cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex:
// daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void getBiggerNumbering() {
        int a = 4;
        int b = 9;
        while (a <= b) {
            if (a < b) {
                System.out.println("Numarul mai mare este b " + b);
                b--;
                if (a > b) {
                    System.out.println(" Numarul mai mare este a " + a);
                    a++;
                }
            }
        }
    }

    //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile
// cu 7, din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.





































