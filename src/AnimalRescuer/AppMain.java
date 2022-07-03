package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog max = new Dog();
        max.setName ("Max");
        System.out.println(max.getName());
        max.setColor("Black");
        max.setWeight(15);
        max.getRace("Labrador");
        max.setAge(3);
        max.getHeightCm(55);

        System.out.println(max.getName());
        max.play();
        max.age();
        System.out.println("Max's height in cm is " + max.getHeightCm());
        System.out.println("Max race is " + max.getRace() + max.setColor());
        System.out.println("Dog's weight is " + max.setWeight());
        System.out.println("Max age is " + max.setAge());
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


