package AnimalRescuer;

public class Dog {
    int age = 2;
    String race = "labrador";
    String name = "Max";
    String color = "black";
    double weight =  15.5;
    int heightCm = 55;

    String recreation = "Bath time";
    public void eat(){
        System.out.println("eating dog food");
    }
    public void sleep(){
        System.out.println("Snores..zzzz");
    }
    public void speak(){
        System.out.println("Ham!");
    }
    public void play(){
        System.out.println("Playing fetch");
    }

    public void waveTail(){
        System.out.println("Waving the tail");
    }
    public void age(){
        System.out.println("Age is");
    }
    public void race(){
        System.out.println(" Max's race is");
    }
    public void color(){
        System.out.println(" Max color is");
    }

    public void weight (){
        System.out.println("Dog 's weight is");
    }
    public void heightCm (){
        System.out.println("Dog's height in cm is");
    }

    public void recreation(){
        System.out.println("Best recreation for " + name + " is " + recreation);
    }
}
