package com.src;

public class ArithmeticOperations {
	
	int deposit;
	long accountNumber;
	int AccountNumber(long accountNumber,int deposit) {
		this.accountNumber=accountNumber;
		this.deposit=deposit;
		return deposit;
		
	}
	int Withdraw(int amount) {
		return deposit-=amount;
	}

}
