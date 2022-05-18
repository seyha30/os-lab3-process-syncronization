package com;

public class Demo {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(1000);
		Father father = new Father(bankAccount);
		father.start();
		Son son = new Son(bankAccount);
		son.start();

	}

}
