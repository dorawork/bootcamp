public class String1 {

  private char[] characters;藍圖
  //constructors
  //Empty comstructor 
  public String1 (){ //形容STRING1 句子
    this.charaters =new cha [];

  }
  public String1(String s){
    this.characters = new char [s.length()];
  }

  public void setCharacters(String s) {
    // this.characters = characters;
    for (int i = 0; i < s.length(); i++) {
      this.characters[i] = s.charAt(i);
    }
  }

  public String getCharacters(){
      //return this.characters;
      String s = "";
      for (int i = 0 ; i < this.characters.length; i++){
        s = s.concat(String.valueOf(this.characters[i]));
      }
      return s;
    }

    public void clear(){
   this.characters = new char[0];
    }

    public String concat(String s){ //新object
      char [] newArr = new char[this.characters.length + s.length()];
      for (int i = 0 ; 1 < newArr.length; i++){
        newArr[idxx++] =
      }
      return String.valueOf(newArr);
    }    

    public void concat2(String s){

    }


  public static void main(String[] args) {
    String str = new String1(); //constructor 比生命

    char[] arr = new char[] { 'c', 'd', 'e' };
    str.setCharacters("cde");

String a = "ABC";
String b = "def";




  }
}
