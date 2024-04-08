public class Game1 {

  private String acName;

  private int lv;

  private String job;

  public void setAcName(String acName){
    this.acName = acName;
  }
  public void setLv(int lv){
    this.lv = lv;
  }
  public void setJob(String job){
    this.job = job;
  }

  public String getAcName(){
    return this.acName;
  }
  public int getLv(){
    return this.lv;
  }
  public String getJob(){
    return this.job;
  }
  public static void main(String[] args) {
  Game1 c = new Game1();
  c.setAcName("Peter");
  c.setLv(40);
  c.setJob("figther");

  System.out.println(c.toString());

}
}
