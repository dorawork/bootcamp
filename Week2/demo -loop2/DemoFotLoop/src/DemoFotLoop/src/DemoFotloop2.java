package DemoFotLoop.src;

public class DemoFotloop2 {

  public static void main(String[] arges) {

    // Single Loop
    // for (int i = 0 ; i<=5; i++)

    // Nested Loop

    for (int i = 0; i < 3; i++) { //行完 j 之後到 i 跟程序做)
      for (int j = 0; j < 3; j++) {//0,1,2
        System.out.println("i=" + i + ",j=" + j);
      }
       System.out.println("hello");
    }
   //Step 1 = 0 < 3 yes
   //Step 2 = j = 0 < 3
   //Step 3 = print
   //Step 4 = j++ == 1


    
     //***** i = 0, j -> 5 
    //****   i = 1, j -> 4
    //***    i = 2, j -> 3 
    //**     i = 3, j -> 2
    //*      i = 4, j -> 1
    int n = 5;
    for (int i = 0; i < n ; i++ ) {

      for (int j = 0; j < n - i ; j++) {
        System.out.print("*");
    }
    System.out.println();
    }
                // step 1: i = 0, 
                // step 2: 0 <= 5  (i) yes
                // step 3: j = 0
                // step 4: 0 <= 5 (j) yes
                // step 4: j ++ become -> 0 + 1
                // step 5: j = 1, 1 < 5
                // step 6: j ++ become -> 1 + 1
                // step 7: j = 2 = < (5 - 0)
                // step 8: j ++ beomce -> 2 + 1

                //   *
                //  ***
                // *****
                //  ***
                //   *
                n = 4;
                for (int i = 0; i < n ; i++ ) {
            
                  for (int k = 0; k < 2 * i -1 ; k++) {
                    //step 1 = k=0
                    //step 2 = 0 < 2 * 0 -1 /no
                    //step 3 = i =1
                    //step 4 = 0 < 2* 1 -1 /yes
                    //step 5 = 1 < 2* 1 -1 /no
                    //step 6 = i =3
                    //step 7 = 0 < 2 * 3 - 1 /yes
                    //step 8 = i =5
                    //for (int h = 0; )
                    System.out.print("*");
                      
                    }
                    System.out.println(" ");
                }
               
    // Seacrhing
    String str2 = "abcdefg hello world";
    int spaceCount = 0;
    for (int i =0; i < str2.length(); i++)
    if (str2.charAt(i) == ' ' && ++spaceCount ==2) {
        System.out.println("index=" +i);
      }

  //break;
  for (int i =0; 1 < 10; i++){
    if ( i >3) {
      break; //break the nearest loop 重複3次
    }
    System.out.println("hello");
  }

  //contiune;
  for (int i =0; 1 < 10; i++){
    if ( i > 3) {
      continue; //skip the rest, go to next iteration 部份不想做10次
}
}
  }
}