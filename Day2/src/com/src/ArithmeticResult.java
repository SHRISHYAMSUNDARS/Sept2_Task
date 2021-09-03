package com.src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArithmeticTest {

	@Test
	void testAdd() {
		ArithmeticOperations a=new ArithmeticOperations();
		a.AccountNumber(1234567890,25000);
		
	}
	@Test
	void testwithdraw() {
		ArithmeticOperations a=new ArithmeticOperations();
		a.Withdraw(20000);
		
	}
}
