public class Animal {
    private String Name;



    private  int legs;
    private  int brain;
    private int ears;
    private int eyes;

    public Animal(String name, int legs, int brain, int ears, int eyes) {
        Name = name;
        this.legs = legs;
        this.brain = brain;
        this.ears = ears;
        this.eyes = eyes;
    }

    public String getName() {
        return Name;
    }

    public int getLegs() {
        return legs;
    }

    public int getBrain() {
        return brain;
    }

    public int getEars() {
        return ears;
    }

    public int getEyes() {
        return eyes;
    }
    public void canEat(){
        System.out.println("canEat is being called");

    }
    public void canMove(int speed){
        System.out.println("Animal is moving at speed " +speed);

    }
}

