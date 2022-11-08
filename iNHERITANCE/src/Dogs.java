public class Dogs extends Animal {
    private String breed;
    private int teeth;
    private int weight;
    public Dogs(String name, int legs, int brain, int ears, int eyes, String breed,int teeth,int weight) {
        super(name, 4, 1, 2, 2);
        this.breed = breed;
        this.teeth=teeth;
        this.weight=weight;
    }
    private void canChew(){
        System.out.println("Dog.chew called");
    }

    @Override
    public void canEat() {
        System.out.println("Dog.eat is called");
        canChew();
        super.canEat();
    }
    public void walk(){
        System.out.println("Walk is being called");
        canMove(5);
    }
    public void run(){
        System.out.println("Run is being called");
        canMove(10);
    }
}






