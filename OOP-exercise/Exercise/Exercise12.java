/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class Exercise12 {

    private int carYear;

    private String carModel;

    // Declare instance variables carYear and carModel

    // Constructor with variables carYear and carModel
    public Exercise12(int carYear, String carModel){
        this.carYear=carYear;
        this.carModel=carModel;
    }

    public String toString(){
        return ("Car Year=" + carYear + "Car Model=" + carModel);
    }
    public static void main(String[] args) {
        Exercise12 exercise12 = new Exercise12(2020, "ModelY");
        System.out.println(exercise12);
        // Create an instance of class Exercise12, with carYear 2020, and carModel "ModelY"
        // print the expected output
    }
}
