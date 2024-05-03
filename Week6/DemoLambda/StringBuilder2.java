package Week6.DemoLambda;

import java.util.ArrayList;
import java.util.List;

public interface StringBuilder2 {
  String concat(List<String>String);
  
  public static void main(String[] args) {
    //lambda
    StringBuilder2 sb2 = (strings) ->{
      StringBuilder sb = new StringBuilder();
      for (String s : strings){
        sb.append(s);
      }
      return sb.toString();
    };
    String reult = sb2.concat(new ArrayList<>(List.of("xxx","yyy")));
    System.out.println(reult);
  }
}
