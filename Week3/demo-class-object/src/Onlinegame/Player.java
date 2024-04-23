package Onlinegame;

public class Player {

  //private int playHowLong;

  private Account account;

  public Player(Account account) {
    this.account = account;
  }

  public static void main(String[] args) {
    Account ac1 = new Account(100);
    Account ac2 = new Account(90);
    Account ac3 = new Account(80);
    Account ac4 = new Account(70);

    Player player1 = new Player(ac1);
    System.out.println(ac1.getAcLv());
    System.out.println(ac4.getAccountID());

  }
}
