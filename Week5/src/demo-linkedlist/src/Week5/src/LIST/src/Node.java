public class Node {

  private String str; //object  reference

  private Node next; //object  reference

  public Node(String str) {
    this.str = str;
  }

  public Node(String str, Node next) {
    this.str = str;
    this.next = next;
  }

  public void setNext(Node next) { //加多隻上去意思? 1隻扣1隻 所以要SET? 圖再*******
    this.next = next;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public Node getNext(){
    return this.next;
  }

  public String getStr(){
    return this.str;
  }

  public static void main(String[] args) {
    //"hello", "abc" ,"def"
    Node head = new Node ("hello", new Node("abc", new Node("def"))); //list
    //                         一個搵一個 --->    hello -> abc -> def //未接受到*********
    //Node n1 = new Node ("hello")
    //Node n2 = new Node ("abc")
/*     Node head = new Node("abc");
    Node head = new Node ("def"); */

    //check head contain "def" -> true /false loop入面有冇

    Node temp = head; //抄出黎指針 head  因為head 指 hello 放左個數先 重點*****
    boolean result = false;
    while (temp.getNext() != null) { //寫GET意思******?搵番個Node?
      //find "def"  如果向前行 temp = temp.getnext;
      //搵到下一個Node地址放在自己地址上, 下次loop繼續做

      if ("def".equals(temp.getStr())){ //前面VALUE可以. 後面.  會空指針//temp.equals("def")?
        result =true;
        break;
      }      
      //move to the next Node****頭向後
      temp = temp.getNext();

      System.out.println(temp.getStr()); //def
      System.out.println(result); //false

      System.out.println("hello".equals(null));//false
      
    }
  }
}
