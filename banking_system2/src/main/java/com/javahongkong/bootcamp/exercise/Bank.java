package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface{
	private LinkedHashMap<Long, Account> accounts; // object reference  ON TO MANY 用HASHAMP?原因

	public Bank() {
		accounts = new LinkedHashMap<>();
		// complete the function
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		return accounts.get(accountNumber);
	}

  	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		Account account = new CommercialAccount(company, pin, startingDeposit);
		accounts.put(account.getAccountNumber(), account);
		return account.getAccountNumber();
		}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		Account account = new ConsumerAccount(person, pin, startingDeposit);
		accounts.put(account.getAccountNumber(),account);
		return account.getAccountNumber();
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		return accounts.get(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		return accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		return accounts.get(accountNumber).debitAccount(amount);
	}
}
