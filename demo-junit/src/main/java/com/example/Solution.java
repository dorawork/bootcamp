package com.example;

import java.util.List;

public class Solution {
  
  public int getTotalCount(List<String>strings){
    return strings.size();
  }

  public static void main(String[] args) {
    
    Solution solution = new Solution();
    solution.getTotalCount(List.of("F","loe"));
  }
}
