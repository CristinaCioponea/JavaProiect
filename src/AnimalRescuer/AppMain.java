package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog max = new Dog();
        max.setName ("Max");
        System.out.println(max.getName());

        System.out.println(max.getName());
        max.play();
        max.age();
        System.out.println("Max's height in cm is " + max.heightCm);
        System.out.println("Max race is " + max.race + max.color);
        System.out.println("Dog's weight is " + max.weight);
        System.out.println("Max age is " + max.age);
        max.sleep();
        max.speak();
        max.waveTail();
        max.recreation();


        FoodDog food = new FoodDog();
        System.out.println("Name food is " + food.nameFood);
food.supplement();
food.setTypeFood();
        System.out.println("Max food meals/Day is " + food.mealsDay);


        Vet paul = new Vet();

        System.out.println("Name vet is ");
        paul.setNameVet("Paul");
        paul.setVaccinYear(3);
    paul.setSpecializationVet("Big Dogs");



    }
}


