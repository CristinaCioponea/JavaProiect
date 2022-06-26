package AnimalRescuer;

public class AppMain {public static void main(String[] args) {
    Dog max = new Dog();
    System.out.println(max.name);
    max.play();
    max.age();
    max.color();
    max.heightCm();
    max.race();
    max.weight();
    System.out.println("Max age is " + max.age);
    max.sleep();
    max.speak();

}
}

