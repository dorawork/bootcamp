import java.util.Arrays;

public class DemoArray2 {

  public static void main(String[] args) {

    //Sorting - Insertion sort
    int [] arr5 = new int[] {-5, 10};// 0,1,2,3,4,5
    for (int i= 1 ; i <arr5.length; i++){
      int key = arr5[i];
      int j;

      for ( j = i -1; j >=0; j--){
        if (arr5[j] <= key){
          break;
        }
        //if -> swap -> break
      }
      arr5[j + 1] =key; //inset
    
    }
    System.out.println(Arrays.toString(arr5)); 

    // Sorting -Selection Sort
    
}
}