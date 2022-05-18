package com;

public class Son extends Thread {
	private BankAccount bankAccount;

	public Son(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Son's process start execution withdrawal amount " + 1000);
		bankAccount.withdrawal(1000);
	}

}
