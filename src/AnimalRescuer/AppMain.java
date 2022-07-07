package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog max = new Dog();
        max.setName ("Max");
        System.out.println(max.getName());
        max.setColor("Black");
        max.setWeight(15);
        max.setRace("Labrador");

        max.setAge(3);
        max.setHeightCm(55);

        System.out.println(max.getName());
        max.play();
        max.age();
        System.out.println("Max's height in cm is " + max.getHeightCm());
        System.out.println("Max race is " + max.getRace() + max.getColor());
        System.out.println("Dog's weight is " + max.getWeight());
        System.out.println("Max age is " + max.getAge());
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
        paul.setNameVet("Paul");
        paul.getNameVet();
        paul.setVaccinYear(3);
    paul.setSpecializationVet("Big Dogs");

        System.out.println(max.recreation);
        System.out.println("Name vet is " + paul.getNameVet());



    }
}


