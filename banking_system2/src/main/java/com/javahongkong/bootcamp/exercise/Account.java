package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;

public abstract class Account implements AccountInterface {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, int pin, double startingDeposit) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
		// complete the constructor
	}

	public AccountHolder getAccountHolder() {
		// complete the function
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {

		// complete the function
		return this.pin == attemptedPin;
	}

	public double getBalance() {
		// complete the function
		return this.balance;
	}

	public double getPin() {
		// complete the function
		return this.pin;
	}

	public Long getAccountNumber() {
		// complete the function
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
	BigDecimal creditAccount = new BigDecimal(amount);
  BigDecimal balance = new BigDecimal(this.balance);
	BigDecimal newBalance = balance.subtract(creditAccount);

		this.balance = newBalance.doubleValue();

		// complete the function
		// BigDecimal
	}

	public boolean debitAccount(double amount) {
		if(amount <= this.balance){
			this.balance -= amount;
			return true;
		}else {
			return false;
		}
			
		}
	}
