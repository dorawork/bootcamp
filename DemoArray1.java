import java.util.Arrays;

public class DemoArray1 {
    public static void main(String[] args) {

        // Array 陣列
        int[] arr = new int[3];// 陣列只可儲3個以下, 3格 參數
        // Assign value to the int array
        arr[0] = 100;
        arr[1] = 1;
        arr[2] = -200;
        System.out.println(arr[0]);//100
        System.out.println(arr[1]);//1
        System.out.println(arr[2]);//-200

        // Create another int array to the original variable
        // resize
        // arr = new int[4];
        // System.out.println (arr[1]);

        arr[0] = 21;
        arr[1] = 45;

        // Example 1

        int[] integers2 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        // loop rint odd numbers
        for (int i = 0; i < integers2.length; i++) {
            if (integers2[i] % 2 == 1) {
                System.out.println(integers2[i]);//1

                // average vlaue of even nubers
                int avg = 0;
                int count = 0;
                for (i = 0; i < integers2.length; i++) {
                    if (integers2[i] % 2 == 0) {
                        avg += integers2[i];
                        count++;

                    }
                }
                System.out.println(i);//7
                // averge value within the int array

                // Find the max value within the in array
                // int max = -1;
                // int max = integers2.MIN_VALUE;
                // for (int i =0 ; i <integers2.length; i++){
                // if (integers2[i]>max) {
                // max = integers2[i];

            }
        }
        // System.out.println("max= " + max);

        // Find the min value within the in array
        int min = -1;
        // Searching
        char[] characters = new char[] { 'a', 'b', 'e', '!' };
        // check if the array contains '!' -> true/false
        boolean result = false;
        // break
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '!') {
                result = true;
                break;
            }
        }
        System.out.println(result);
        // print out the first index of '!', if not found, print -1.
        int index = -1;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '!') {
                index = i;
                break;

            }
        }
        System.out.println(index);//3

        // Store all index of '!' in another array
        char[] characters2 = new char[] { 'a', 'b', '!', 'e', '!' }; // 2,4
        int[] indexes = new int[characters2.length];
        int j = 0;
        for (int i = 0; i < characters2.length; i++) {
            if (characters2[i] == '!') {
                indexes[j] = i;
                j++;
                // indexes[j++] = i;
            }
        }
        System.out.println(Arrays.toString(indexes)); // 2 ,4, 0,0

        String[] balls = new String[] { "RED", "YELLOW", "BLACK", "YELLOW" };
        double[] prices = new double[] { 5.5, 7.8, 10.0, 7.8 };
        int[] quantities = new int[] { 1, 3, 4, 5 };
        // Find the total ammount of Yellow balls (price * quantity)
        double ammount = 0.0;
        // 7.8 * 3 + 7.8 * 5
        for (int i = 0; i < balls.length; i++) {
            if ("YELLOW".equals(balls[i])) {
                ammount += prices[i] * quantities[i];
                // Step 1 : i= 1
                // Step 2 : Yellow = Yes
                // Step 3 : i=0
                // Step 4 : 7.8 *3
                // Step 5 : i = 23.4
                // Step 6 : i= 2
                // Step 7 : Yellow = No
                // Step 8 : i=3
                // Step 9 : Yellow =Yes
                // Step 10: 23.4 + 7.8*5
                // Step 11: i = 62.4

            }
        }
        System.out.println(ammount);

        // Swapping
        int[] arr3 = new int[] { 10, 3, 9, 4 }; // 0 , 1 , 2 ,3
        int temp = arr3[0]; // backup
        arr3[0] = arr3[2]; //
        arr3[2] = temp;
        System.out.println(Arrays.toString(arr3));

        // 9, 3, 10 ,4
        int tt = -1;
        int[] arr4 = new int[] { 9, 3, 10, 4 };
        for (int i = 0; i < arr4.length - 1; i++) {
            tt = arr4[i];
            arr4[i] = arr4[i + 1];
            arr4[i + 1] = tt;
        }
        System.out.println(Arrays.toString(arr4));
        // Now : [9 ,3 ,10 ,4]
        // Target: [3 ,10 ,4 ,9]
        // Move the first element to the tail :loop +swap

        // Now :[3,10 ,4 ,9] next
        // target [10, 3, 4, 9]
        // Move the maxvalue to the head of the array
        int max2 = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; 1 < arr4.length; i++) {
            if (arr4[i] > max2) {
                max2 = arr4[i];
                idx = i;
            }
        }
        for (int i = idx; i > 0; i--) {
            tt = arr4[i];
            arr4[i] = arr[i - 1];
            arr4[i - 1] = tt;
        }
        System.out.println(Arrays.toString(arr4)); //(10,3 ,4, 9)

        // Sorting
        int[] arr6 = new int[] { -10, -42, 8, 19, 1 };
        // Round 1
        // [-42, -10, 8, 19 ,1] :-10 > -42
        // [-42, -10, 8, 19, 1] : 8 > -10
        // [-42, -10, 8, 19, 1] : 19 >8
        // [-42, -10, 8, 1, 19] : 1 > 19 NO 調位

                // Round 2
        // [-42, -10, 8, 1, 19] :-10 > -42
        // [-42, -10, 8, 1, 19] : 8 > -10
        // [-42, -10, 1, 8, 19] : 8 > 1 NO 調位
        // Target [-42, -10 , 1, 8, 19]

        // Round 3
        for (int i =0 ; i <arr6.length;i++){ //0,1,2,3,4
            for (int k = 0 ; k <arr6.length -i ; k++){
                if (arr6[k] >arr6[k +1]){
                    tt = arr6[k];
                    arr6[i] = arr[i -1];
                    arr6[i-1] = tt;
                }
                System.out.println(Arrays.toString(arr6)); 
            }
        } 
        //int[] arr6 = new int[] { -10, -42, 8, 19, 1 };
        //for (int i = 0 ; i )

        }
    }
