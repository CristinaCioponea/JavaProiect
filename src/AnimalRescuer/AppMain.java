package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog max = new Dog();
        Duck ducky = new Duck();
        Cat pisi = new Cat();



        ducky.setName("Ducky");
        System.out.println(ducky.getName());
        ducky.setColor("White");
        System.out.println(ducky.getColor());
        pisi.setName("Pisi");
        System.out.println(pisi.getName());
        pisi.setColor("Gray");
        System.out.println(pisi.getColor());

        max.setColor("Black");
        System.out.println(max.getColor());
        max.setWeight(15);
        System.out.println(max.getWeight());
        max.setRace("Labrador");
        System.out.println(max.getRace());

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


