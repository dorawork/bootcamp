/**
 * Expected Output:
 * Running as fast as it can!
 * Speed: 150
 * Speed: 120, carModel: ModelX
 */
public class Exercise13 {

    private int speed;

    private String carModel;
    
    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("Running as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setCarModel(String carModel){
        this.carModel=carModel;
    }
    public String getCarModel(){
        return carModel;
    }

    // Create method with same name, but with different parameters
    public Exercise13(int speed, String carModel) {
        this.speed=speed;
        this.carModel=carModel;
    }
    public String toString(){
        return ("Speed: " + speed + " carModel: "+ carModel);
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        Exercise13 myCar = new Exercise13 (150,"ModelX" ); // Create a myCar object
        myCar.fullThrottle(); // Call the fullThrottle() method
        myCar.setSpeed(150); // Call the speed() method
        System.out.println("Speed: " + myCar.getSpeed());
        myCar.setSpeed(120);
        System.out.println(myCar);
    }
}
