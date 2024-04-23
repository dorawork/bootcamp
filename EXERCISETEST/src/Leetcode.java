package EXERCISETEST.src;

public class Leetcode {
//唔太明? https://leetcode.com/problems/richest-customer-wealth/

    public int maximumWealth(int[][] accounts) {
        int max = -1;
        int ammount = -1;

        for(int i = 0 ; i < accounts.length; i++){
          //step 1, i = 0
          //step 2, j = 0 
          //step 3,  0 = 0
          //step 4,  i = 1, j = 0 < i = 1
          //step 5, ammount 1 =
            ammount = 0 ;
            for(int j = 0 ; j < accounts[i].length; j++){
                ammount += accounts[i][j];
            } 
            if (ammount > max)
                max = ammount;
        
        }

        return max;
    }

    //Math 加減數使用 CHARat
//https://leetcode.com/problems/score-of-a-string/description/ 未明
  class Solution {
    public int scoreOfString(String s) {
    int sum = 0;
    for (int i = 0; i < s.length() -1; i++ ){
        sum += Math.abs(s.charAt(i) -s.charAt(i + 1));
    }
    return sum;
  }
}
}
