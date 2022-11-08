public class main {
    public static void main(String[] args) {


        Animal animal = new Animal("Labrador", 4, 1, 2, 2);
        animal.getBrain();
        System.out.println(animal.getBrain());

        Dogs dog=new Dogs("Sayan",2,1,2,2,"Jungli",32,72);
        dog.canEat();
        dog.canMove(5);
        dog.walk();
        dog.run();


    }
}
