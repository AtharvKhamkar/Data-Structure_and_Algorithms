package stqa;

import java.util.Scanner;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        //System.out.println("Account Created sucessfully.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Sucessfully : $" + amount);
        } else if(amount<0){
        	System.out.println("Enter valid amount !!!"); 
        }else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful, and the balance is updated : $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class Customer {
    private String name;
    private Account account;

    public Customer(String name, int accountNumber, double initialBalance) {
    	if(name.isEmpty()) {
    		System.out.println("Invalid customer name!!!");
    		throw new IllegalArgumentException("Customer name cannot be empty");

    		
    	}
        this.name = name;
        this.account = new Account(accountNumber, initialBalance);
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public int getAccountNumber() {
    	return account.getAccountNumber();
    }
    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void displayBalance() {
        System.out.println(name + "'s Account Balance: $" + account.getBalance());
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return account.getBalance();
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();

        Customer customer = new Customer(name, accountNumber, initialBalance);

        while (true) {
            System.out.println("\nBanking Options:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    customer.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    customer.withdraw(withdrawalAmount);
                    break;
                case 3:
                    customer.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
