package stqa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegrationTesting {

	private Customer customer;

    @BeforeEach
    void setUp() {
        // Initialize a customer with an initial balance
        customer = new Customer("John Doe", 12345, 1000.0);
    }

    @Test
    void testDepositAndBalanceIntegration() {
        // Deposit an amount into the account
        customer.deposit(500.0);

        
        // Verify that the final balance is as expected
        boolean testPassed = customer.getBalance() == 1500.0;

        if (testPassed) {
            System.out.println("Deposit and Balance Integration Test: Passed");
        } else {
            System.out.println("Deposit and Balance Integration Test: Failed");
        }
        assertTrue(testPassed);
    }

    @Test
    void testAccountCreationAndDepositIntegration() {
        // Deposit an amount into the account
        customer.deposit(500.0);

        // Verify that the account was created with the correct initial balance
        boolean accountNumberPassed = customer.getAccountNumber() == 12345;
        boolean balancePassed = customer.getBalance() == 1500.0;

        boolean testPassed = accountNumberPassed && balancePassed;

        if (testPassed) {
            System.out.println("Account Creation and Deposit Integration Test: Passed");
        } else {
            System.out.println("Account Creation and Deposit Integration Test: Failed");
        }
        assertTrue(testPassed);
    }

    @Test
    void testWithdrawAndDisplayBalanceIntegration() {
        // Withdraw an amount from the account
        customer.withdraw(500.0);

        // Display the account balance
        double balance = customer.getBalance();

        // Verify that the withdrawal and balance display interactions are functioning correctly
        boolean balancePassed = balance == 500.0;

        boolean testPassed = balancePassed;

        if (testPassed) {
            System.out.println("Withdraw and Display Balance Integration Test: Passed");
        } else {
            System.out.println("Withdraw and Display Balance Integration Test: Failed");
        }
        assertTrue(testPassed);
    }

    @Test
    void testDepositsAndWithdrawalsIntegration() {
        // Deposit multiple amounts into the account
        customer.deposit(500.0);

        // Withdraw multiple amounts from the account
        customer.withdraw(200.0);
        System.out.println(customer.getBalance());
        // Verify that the final balance reflects the sum of deposits minus the sum of withdrawals
        boolean testPassed = customer.getBalance() == 1300.0;

        if (testPassed) {
            System.out.println("Multiple Deposits and Withdrawals Integration Test: Passed");
        } else {
            System.out.println("Multiple Deposits and Withdrawals Integration Test: Failed");
        }
        assertTrue(testPassed);
    }
    
    @Test
    void testMultipleDepositsAndWithdrawalsIntegration() {
    	
        // Deposit multiple amounts into the account
        customer.deposit(200.0);
        customer.deposit(300.0);

        // Withdraw multiple amounts from the account
        customer.withdraw(150.0);
        customer.withdraw(350.0);
        System.out.println(customer.getBalance());

        // Verify that the final balance reflects the sum of deposits minus the sum of withdrawals
        boolean testPassed = customer.getBalance() == 1000.0;

        if (testPassed) {
            System.out.println("Multiple Deposits and Withdrawals Integration Test: Passed");
        } else {
            System.out.println("Multiple Deposits and Withdrawals Integration Test: Failed");
        }
        assertTrue(testPassed);
    }

}
