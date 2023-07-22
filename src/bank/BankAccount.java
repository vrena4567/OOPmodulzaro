package bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountName;
    private final String accountNumber;
    private int balance;

    public BankAccount(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }
    public void withdraw(int amount) {
        try {
            if(this.balance>=amount) {
                this.balance -= amount;
            } else {
                throw new exception();
            }
        } catch (exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void transfer (BankAccount bankAccount, int amount) {
        try {
            if(this.balance>=amount) {
                this.balance -= amount;
                bankAccount.deposit(amount);
            } else {
                throw new exception();
            }
        } catch (exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void isValidAccountNumber(BankAccount bankAccount) {
 //      List<Integer> accountNumbers = new ArrayList<>();
 //      for (int i = 0; i < bankAccount.getAccountNumber().length(); i++) {
 //          accountNumbers.add(bankAccount.getAccountNumber().indexOf(i));
 //      }
 //      System.out.println(accountNumbers.toString());
 //      for (String actualNumber : bankAccount.getAccountNumber().toString() {
 //          accountNumbers
 //      }
 //      if(bankAccount.getAccountNumber())
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int balance) {
        this.balance += balance;
    }
}
