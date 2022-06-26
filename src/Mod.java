public class Mod {

    String text = "FastTrackIt";
    int number = 3;

    public String checkNumber (int number) {
        if (number <= 3) {
            return text + number;
        } else if (number >= 4) {
            return number + text;
        }
        return checkNumber(3);

    }

}

