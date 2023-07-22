package bank;

public class Main {
    public static void main(String[] args) {
        BankAccount reniSzamla = new BankAccount("Reni", "1235132131");
        BankAccount almaSzamla = new BankAccount("Alma", "2100046000");
        reniSzamla.deposit(2000);
        almaSzamla.deposit(100);
        System.out.println(reniSzamla.getAccountName());
        System.out.println(reniSzamla.getBalance());
        reniSzamla.withdraw(500);
        System.out.println(reniSzamla.getBalance());
        reniSzamla.transfer(almaSzamla, 1500);
        System.out.println("Utalás után:");
        System.out.println(reniSzamla.getAccountName() + ": " + reniSzamla.getBalance());
        System.out.println(almaSzamla.getAccountName() + ": " + almaSzamla.getBalance());
        BankAccount.isValidAccountNumber(almaSzamla);
    }
}
