public class Vehicle {
    private String name;

    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;

        this.size = size;
        this.currentVelocity=0;
        this.currentDirection=0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }


    public void Steer(int direction){
        currentDirection+=direction;
        System.out.println("Vehicle.steer(): Steering at " +currentDirection + " degrees ");

    }
    public void move(int velocity,int direction){
        currentVelocity=velocity;
        currentDirection=direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }
    public void changeVelocity(int speed,int direction){
        move(speed,direction);
        System.out.println("Car.changeVelocity(): Velocity" +speed + "direction" +direction);
    }
    public void stop(){
        this.currentVelocity=0;
    }
}