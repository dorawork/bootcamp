import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        LinkedList<String> strings = new LinkedList<>(); //需要暗示將使用複雜Linklist method******* 
        strings.add("hello");
        strings.add("abc");//一堆STRING
        System.out.println(strings.size());//2
        //arrylis距陣 左右儲存address
        strings.remove(1);//[hello] 刪左第一條
        System.out.println(strings);
        System.out.println(strings.contains(new String("hello")));// true check //睇equal? contains?*******

        //ArrayList methods 有自己method != LinkedList methods
        //ArrayList and LinkList has its own methods

        List<String> ls = new LinkedList<>(); //左邊合約 = 右邊換底層
        ls.add("abc");
        ls.add("def");
        ls.add("Vincet");
        for (int i = 0; i <ls.size(); i++){ //for loop
            System.out.println(ls.get(i)); //for loop 1,2,3 ,1,2 , 1 唔係ARRAY 中{} GET可以去到第3個格
            //但LIST係每一格都行 GET7
        }
        // for-each
        for (String s : ls) { // next
            if ("def".equals(s))
              System.out.println("this is def");
              break;
          }
  
          LinkedList<String> ll = new LinkedList<>();
          ll.add("hello"); // = addLast()
          ll.addLast("abc");
          ll.addFirst("Jenny");
          System.out.println(ll); // [Jenny, hello, abc]
  
          ArrayList<String> as = new ArrayList<>();
          as.add("hello");
          as.add("ijk");
          as.add("def");
          as.remove(1);
    }
}
