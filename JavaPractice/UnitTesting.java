package stqa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitTesting {
	@BeforeEach
    void setUp() {    

       Customer customer = new Customer("ram", 21234, 10000);

    }
    

	@Test
	void testCreateAccountWithEmptyName() {
	    boolean testPassed = true;

	    try {
	        // Attempt to create an account with an empty name
	        Customer customer = new Customer("", 12345, 1000.0);
	        testPassed = false; // If the line above doesn't throw an exception, mark the test as failed
	    } catch (IllegalArgumentException ex) {
	        // An exception was thrown, which is expected
	        System.out.println("Test Passed: Account not created with an empty name.");
	    }

	    if (!testPassed) {
	        System.out.println("Test Failed: Account created with an empty name.");
	    }

	    assertTrue(testPassed);
	}


	@Test
	void testNegativeDeposit() {
		Customer customer = new Customer("ram", 21234, 1000);
	    customer.deposit(-100.0);
	    boolean testPassed = customer.getBalance() == 1000.0;

	    if (testPassed) {
	        System.out.println("testNegativeDeposit: Passed");
	    } else {
	        System.out.println("testNegativeDeposit: Failed");
	    }

	    assertTrue(testPassed);
	}

	@Test
	void testZeroDeposit() {
		Customer customer = new Customer("ram", 21234, 1000);
	    customer.deposit(0.0);
	    boolean testPassed = customer.getBalance() == 1000.0;

	    if (testPassed) {
	        System.out.println("testZeroDeposit: Passed");
	    } else {
	        System.out.println("testZeroDeposit: Failed");
	    }

	    assertTrue(testPassed);
	}

	

	@Test
	void testNegativeWithdrawal() {
		Customer customer = new Customer("ram", 21234, 1000);
	    customer.withdraw(-100.0);
	    boolean testPassed = customer.getBalance() == 1000.0;

	    if (testPassed) {
	        System.out.println("testNegativeWithdrawal: Passed");
	    } else {
	        System.out.println("testNegativeWithdrawal: Failed");	    }

	    assertTrue(testPassed);
	}

	@Test
	void testInsufficientBalanceWithdrawal() {
		Customer customer = new Customer("ram", 21234, 1000);
	    customer.withdraw(2000.0);
	    boolean testPassed = customer.getBalance() == 1000.0;

	    if (testPassed) {
	        System.out.println("testInsufficientBalanceWithdrawal: Passed");
	    } else {
	        System.out.println("testInsufficientBalanceWithdrawal: Failed");
	    }

	    assertTrue(testPassed);
	}


}
