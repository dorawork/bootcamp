package com.javahongkong.bootcamp.exercise;

public class Transaction implements TransactionInterface {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *                      The bank where the account is housed.
	 * @param accountNumber
	 *                      The customer's account number.
	 * @param attemptedPin
	 *                      The PIN entered by the customer.
	 * @throws Exception
	 *                   Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		this.bank = bank;
		this.accountNumber = accountNumber;
		if (!(bank.authenticateUser(accountNumber, attemptedPin)))
			throw new Exception();
		// complete the function
	}

	public double getBalance() {
		// complete the function
		return this.bank.getAccount(accountNumber).getBalance();
	}

	public void credit(double amount) {
		// complete the function
		this.bank.credit(accountNumber, amount);;
	}

	public boolean debit(double amount) {
		// complete the function
		return this.bank.debit(accountNumber, amount);
	}
}
