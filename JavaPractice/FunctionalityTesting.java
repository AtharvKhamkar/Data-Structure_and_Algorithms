package stqa;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FunctionalityTesting {
    private Account account;

    private Customer customer;

    @BeforeEach
    void setUp() {    

        customer = new Customer("ran", 21234, 1000);

    }
    
    
    @Test
    void testCreateNewAccount() {
        Customer newCustomer = new Customer("Alice Smith", 54321, 2000.0);
        boolean namePassed = "Alice Smith".equals(newCustomer.getName());
        boolean accountNumberPassed = 54321 == newCustomer.getAccountNumber();
        boolean balancePassed = 2000.0 == newCustomer.getBalance();

        if (namePassed && accountNumberPassed && balancePassed) {
            System.out.println("Account created Successfully!!");
        } else {
            System.out.println("Account Not created!!!");
            if (!namePassed) {
                System.out.println("Name assertion failed.");
            }
            if (!accountNumberPassed) {
                System.out.println("Account number assertion failed.");
            }
            if (!balancePassed) {
                System.out.println("Balance assertion failed.");
            }
        }
        assertTrue(namePassed && accountNumberPassed && balancePassed);
    }



    @Test
    void testValidDeposit() {
        customer.deposit(500.0);
        boolean testPassed = customer.getBalance() == 1500.0;

        if (testPassed) {
            System.out.println("Money get deposited!!!");
        } else {
            System.out.println("Money not deposited!!!");
        }

        assertTrue(testPassed);
    }


    

    @Test
    void testValidWithdrawal() {
        customer.withdraw(500.0);
        boolean testPassed = customer.getBalance() == 500.0;

        if (testPassed) {
            System.out.println("Sucessfully withdrawal.");
        } else {
            System.out.println("Not withdrawal.");
        }

        assertTrue(testPassed);
    }

    @Test
    void testDisplayBalance() {
        // Create a customer with an initial balance
        Customer customer = new Customer("John Doe", 12345, 1000.0);

        // Capture the printed output using the standard output (System.out)
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call the displayBalance method, which prints the balance
        customer.displayBalance();
        String output = outputStream.toString();

        // Check if the printed output contains the expected balance message
        assertTrue(output.contains("John Doe's Account Balance: $1000.0"));

        // Restore the original standard output
        System.setOut(originalOut);

        // Check if the test passed or failed and print the result
        if (output.contains("John Doe's Account Balance: $1000.0")) {
            System.out.println("Balance"+customer.getBalance());
        } else {
            System.out.println("display balance Test failed!");
        }
    }

    

    
}
