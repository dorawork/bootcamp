package DemoFotLoop.src;

public class DemoFotLoop {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {// 0, 1, 2 入面三樣野 initialization; continue condition ; incremental rule)
            // step 1: int i =0
            // step 2: i < 3 ? yes
            // step 3: Print hello world
            // step 4: ++ -> i become 1
            // step 5: i < 3 yes
            // step 6: Print hello world
            // step 7: ++ -> i become 2
            // step 8: i < 3 yes
            // step 9: Print hello world
            // step 10: ++ -> i become 3
            // step 11: i < 3 NO

            // Never to re-assign value to i with in the loop

            System.out.println("hello world");
        }

        for (int i = 5; i >= 0; i--) { // 5, 4, 3, 2, 1, 0

            System.out.println("hello world " + i);
        }
        // print out :1 3 5 7 9
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                // step 1: int i = 0
                // step 2: i < 10 yes
                // step 3: if 0 % 2 = 0 no
                // step 4: no Print
                // step 5: ++ -> i become 1
                // step 6: i < 10 yes
                // step 7: 1 % 2 =1 yes
                // step 8: Print "1"
                System.out.print(i + " ");
            }
        }

        String s = "abcdefg";
        // print out: aceg
        // chatAt(), String concat
        String result = "";

        for (int i = 0; i < s.length(); i++) {// 0,1,2,3,4,5,6 成個字串大於 i 停
            if (i % 2 == 0) {
                // result = result + s.charAt(i); // 0, 2 ,4 ,6
                result += s.charAt(i);
            }
        }

        System.out.println(result);
        String pattern = "cd";

        // "abcdefg" has string pattern "cd", so print true
        // 55 = 1 + 2 + 3 + 4 ... + 10
        int max = 10;
        int min = 1;
        int k = 0;
        // print:55
        // int K = 0;
        for (int i = min; i <= max; i++) {
            k += i; // k = k + i// +1 +2 + 3 +4
            // System.out.println(k); 睇番每一個步驟
        }
        System.out.println(k); // 55

        // sum up all even number 偶數
        k = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                k += i;
                // step 1: int i = 1
                // step 2: i <= 10 yes
                // step 3: if 1 % 2 = 0 / no
                // step 4: i++ become -> 1 + 1 = 2
                // step 5: i <= 10 yes
                // step 6: if 2 % 2 = 0 yes
                // step 7: k += i = 0 + 2 = 2, k =2
                // step 8: i++ become -> 2 + 1 =3
                // step 9: if 3 % 2 = 0 no
                // step 10: i++ become -> 3 + 1 =4
                // step 11: i <= 10 yes
                // step 12: if 4 % 2 = 0 yes
                // step 13: k += i = 2 + 4 = 6, k=6
            }
        }
            System.out.println(k); // 30

            // Counting
            String str = "hello world";
            int count = 0;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == 'l') {
                    count++;
                    
                    //part B

                    //part C
                }
            }
            System.out.println("count=" + count);// 3
            // cunt the number of 'l' ->3
            // for (int i = 0; i <str.length():i++) {
            // if chatAt() (數字數)

        // sum up all odd numbers, and all even numbers
        // 1 - 2 + 3 -4 + 5 ...-10
        int k2 = 0;
        for (int i = min; 1 <= max; i++) { //min =1, max =10
            if (i % 2 == 0) {
                k2 -= i;
            } else {
                k2 += i;
            }
        }
        System.out.println("k2=" + k2);//-5 (1 +3 +5 +7 +9 -2 -4 -6 -8 -10)
    }

}