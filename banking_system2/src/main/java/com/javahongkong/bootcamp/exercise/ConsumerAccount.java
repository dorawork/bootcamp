package com.javahongkong.bootcamp.exercise;

public class ConsumerAccount extends Account{

	private double currentBalance;

	public ConsumerAccount(Person person, int pin, double currentBalance) {
		super(person, pin);
		this.currentBalance = currentBalance;
		// complete the function
	}
	public double getCurrentBalance(){
		return currentBalance;
	}

}