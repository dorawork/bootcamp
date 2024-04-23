public class StringBox implements CharSequence {

  private char[] characters;

  public StringBox(String str) {
    this.characters = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {

    }
  }

  @Override
  public char charAt(int index) {
    return this.characters[index];
  }

  @Override
  public int length() {
    return this.characters.length;
  }

  @Override
  public CharSequence subSequence(int beginIndex, int endIndex) {
    StringBuilder sb = new StringBuilder();
    for (int i = beginIndex; i < endIndex; i++) {
      sb.append(this.characters[i]);
    }
    return sb;
  }
    public static void main(String[] args) {
      CharSequence cs1 = new StringBox("hello");
      System.out.println(cs1.charAt(1));//e

      CharSequence cs2 = new StringBox("hello");
      //cs.replace()
      System.out.println(cs2.charAt(1));//e

      System.out.println(ascli(cs1,2)); //100
      System.out.println(ascli(cs2,2)); //100

      public static int ascli (CharSequence cs1,int index){
        return cs1.charAt(index); //upcasrt, char -> int
      }
      
    }
  }