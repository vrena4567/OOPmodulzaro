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
            if (this.balance >= amount) {
                this.balance -= amount;
            } else {
                throw new exception();
            }
        } catch (exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void transfer(BankAccount bankAccount, int amount) {
        try {
            if (this.balance >= amount) {
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
        List<String> szamlaszamok = new ArrayList<>();
        for (int i = 0; i < bankAccount.getAccountNumber().length(); i++) {
            szamlaszamok.add(bankAccount.getAccountNumber().substring(i, i+1));
        }
        int sum = 0;
        for (String actualNumber : szamlaszamok) {
            sum += Integer.parseInt(actualNumber);
        }
        int elso = Integer.parseInt(szamlaszamok.get(0));
        int utolso = Integer.parseInt(szamlaszamok.get(szamlaszamok.size()-1));
        boolean elsoOszthato = elso % 2 == 0;
        boolean utolsoOszthato = utolso % 2 == 0;
        if(sum >= 20 && elsoOszthato == utolsoOszthato) {
            System.out.println("Valid Account");
        } else {
            System.out.println("Invalid Account");
        }
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
