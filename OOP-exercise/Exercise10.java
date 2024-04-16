/**
 * Expected Output: 8
 */
public class Exercise10 {

    private int x; // Create an instance attribute

    // Create a class constructor for the Main class
    public void SetX(int x) {
        this.x  = x ;
        // Set the value for the instance attribute x to expected output
    }
    public int getX(){
        return this.x;
    }


    public static void main(String[] args) throws Exception {
        Exercise10 exercise = new Exercise10();
        exercise.SetX(8);
        System.out.println(exercise.getX());

        // Create an instance of this class Exercise10

        // Print the value of instance attribute
    }
}
