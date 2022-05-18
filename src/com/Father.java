package com;

public class Father extends Thread {

	private BankAccount bankAccount;

	public Father(BankAccount bankAccount) {
		this.bankAccount = bankAccount;

	}

	@Override
	public void run() {
		super.run();
		System.out.println("Father 's process start execution deposit amount " + 500);
		bankAccount.deposit(500);
	}

}
