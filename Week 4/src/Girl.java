public class Girl extends Boy {

  private String firstName;

  private String lastName;

  private int age;

  public Girl(int age, String firstName, String lastName) {
    super(firstName, lastName);
    this.age = age;
  }

  public static void main(String[] args) {
    Girl girl = new Girl(10, "Kitty", "Wong");
    girl.setLastName("kk");
    System.out.println(girl.getFirstName());
  }
}