public class Account {
  // ..
  private Transaction[] transaction;

  public Account() {
    this.transaction = new Transaction[0];
  }

  public void add(Transaction transaction) { //呢一句唔太明
    Transaction[] copyArr =this. transaction;
    this.transaction = new Transaction [copyArr.length +1];
    int idx = 0;
    for (Transaction t:copyArr){
      this.transaction[idx++]= t;
    }
    this.transaction [idx] =transaction;
  }

  public double balance() {
    return -1.0d;
  }

  public void credit(Currency currency, double ammount){
  }

  //boolean

  public void debit(Currency currency, double ammount){
  }

  public static void main(String[] args) {
    Account account = new Account();
    account.add(new Transaction(Sign.CREDIT, Currency.HKD, 2500));
    account.add(new Transaction(Sign.DEBIT, Currency.HKD, 1300));
    System.out.println(account.balance());// 1200

    //封裝
    account.credit(Currency.HKD, 1000);
    account.debit(Currency.HKD, 500);

  }
}
