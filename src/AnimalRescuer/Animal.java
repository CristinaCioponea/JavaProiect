package AnimalRescuer;

public class Animal {
    private int age;
    private String race;
    private String name;
    private String color;
    private double weight;
    private int heightCm;

    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;

    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setRace (String race){
        this.race = race;
    }
    public String getRace(){
        return race;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setHeightCm (int age) {

        this.heightCm = heightCm;
    }
    public int getHeightCm(){
        return heightCm;
    }

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

    public String getRecreation() {
        return recreation;
    }

    public void setRecreation(String recreation) {
        this.recreation = recreation;
    }

    public void recreation(){
        System.out.println("Best recreation for " + name + " is " + recreation);
    }
}

