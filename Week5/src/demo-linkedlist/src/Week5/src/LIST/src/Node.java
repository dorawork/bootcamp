public class Node {

  private String str;

  private Node next;

  public Node(String str) {
    this.str = str;
  }

  public Node(String str, Node next) {
    this.str = str;
    this.next = next;
  }

  public void setNext(Node next) {
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
    Node head = new Node ("hello", new Node("abc", new Node("def")));
/*     Node head = new Node("abc");
    Node head = new Node ("def"); */

    //check head contain "def" -> true /false
    Node temp = head;//放左個數先 重點
    boolean result = false;
    while (temp.getNext() !=null) {
      //find "def"
      if ("def".equals(temp.getStr())){
        result =true;
        break;
      }      
      //move to the next Node
      temp = temp.getNext();

      System.out.println(temp.getStr()); //def
      System.out.println(result); //false
      
    }
  }
}
