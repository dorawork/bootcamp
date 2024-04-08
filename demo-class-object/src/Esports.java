public class Esports {

  private int age;

  private String game;

  private String ranking;

  public void setAge(int age) {
    this.age = age;
  }

  public void setGame(String game) {
    this.game = game;
  }

  public void setRanking(String ranking) {
    this.ranking = ranking;
  }
  public int getAge(){
    return this.age;
  }
  public String getGame(){
    return this.game;
  }
  public String getRanking(){
    return this.ranking;
  }
  public static void main(String[] args) {
    Esports c = new Esports();
    c.setAge(18);
    c.setGame("LOL");
    c.setRanking("Top");
  
    System.out.println(c.toString());
  
  }
}
