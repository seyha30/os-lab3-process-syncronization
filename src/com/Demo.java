package com;

public class Demo {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(1000);
		Father father = new Father(bankAccount);
		Son son = new Son(bankAccount);
		father.start();
		son.start();

	}

}
