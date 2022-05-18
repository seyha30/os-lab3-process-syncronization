package com;

public class BankAccount {

	private double balance;

	public BankAccount(double amount) {
		this.balance = amount;
		System.out.println("Initialize balance " + getAccountBalance());
	}

	public void deposit(double amount) {
		System.out.println(Thread.currentThread().getClass());
		showBalance("Previous balance");
		this.balance += amount;
		showBalance("Last balance");
	}

	public void withdrawal(double amount) {
		System.out.println(Thread.currentThread().getClass());
		showBalance("Previous balance");
		this.balance -= amount;
		showBalance("Last balance");
	}

	public double getAccountBalance() {
		return this.balance;
	}

	public void showBalance(String message) {
		System.out.println(message +" "+ getAccountBalance());

	}

	public BankAccount() {

	}

}
