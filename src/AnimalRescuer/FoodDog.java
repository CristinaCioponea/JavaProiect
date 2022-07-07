package AnimalRescuer;

public class FoodDog {
    int mealsDay = 3;
    String nameFood = "Pedigree";
    String supplement = "bone";
    String typeFood = "only adult";
public void supplement(){
    System.out.println("The best bone in town is for...");
}
public void setTypeFood(){
    System.out.println("Max type of food is " + typeFood);


}

    public int getMealsDay() {
        return mealsDay;
    }

    public void setMealsDay(int mealsDay) {
        this.mealsDay = mealsDay;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }
}
