import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> strings = new LinkedList<>(); //需要暗示
        strings.add("hello");
        strings.add("abc");
        System.out.println(strings.size());//2

        strings.remove(1);//[hello]
        System.out.println(strings);
        System.out.println(strings.contains(new String("hello")));// true check 

        //ArrayList methods != LinkedList methods??
        //ArrayList and LinkList has its own methods

        List<String> ls = new LinkedList<>();
        ls.add("abc");
        ls.add("def");
        ls.add("Vincet");
        for (int i = 0; i <ls.size(); i++){ //for loop
            System.out.println(ls.get(i)); //for loop
        }
    }
}
