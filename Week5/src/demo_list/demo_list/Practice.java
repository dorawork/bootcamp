package demo_list.demo_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {
  
public static void main(String[] args) {
  List<Integer>  integers = new ArrayList<>();
  integers.add(2);
  integers.add(2);
  integers.add(3);
  integers.add(3);
  integers.add(1);
  //..
}
public static Set<Integer>getDuplicated(List<Integer>integers){
  //2,2,3,3,1 ->2,3
  //Map

  Set<Integer> results =new HashSet<>(); // 創建一個 HashSet 來存儲結果
  Map<Integer, Integer>map = new HashMap<>();// 創建一個 HashMap 來檢查重複元素
  for (Integer x : integers){// 遍歷整數列表
    if (map.containsKey(x)){ // 如果 HashMap 中已經包含了該元素
      results.add(x); // 將該元素添加到結果集合中
      continue; //
    }
    map.put(x, null);
  }
  return results;
}
}
