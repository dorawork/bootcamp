package Onlinegame;

public class Account {

  private static int accountID;

  private int acLv;

  public Account(int acLv) {
    accountID++;
    this.acLv = acLv;
  }

  public int getAcLv() {
    return this.acLv;
  }

  public int getAccountID() {
    return accountID;
  }
}