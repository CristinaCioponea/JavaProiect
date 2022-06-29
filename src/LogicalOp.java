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
                System.out.println("The number os 0"); break;
            case 1:
                System.out.println("The number is 1"); break;
            case 2:
                System.out.println("The number is 2"); break;
            case 3:
                System.out.println("The number is 3"); break;
            case 4:
                System.out.println("The number is 4"); break;
            case 5:
                System.out.println("The number is 5"); break;
            case 6:
                System.out.println("The number is 6"); break;
            case 7:
                System.out.println("The number is 7"); break;
            case 8:
                System.out.println("The number is 8"); break;
            case 9:
                System.out.println("The number is 9"); break;
            default:
                System.out.println("Not allowed");
        }
return number;
    }

public boolean isNumberEven (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;

        }
}

}










