package Lesson1.ATM;

public class ATM {
    public double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double withdraw(double amount) {
        System.out.println(balance-amount);
        return balance-amount;
    }
    public double deposit(double amount) {
        System.out.println(balance+amount);
        return balance+amount;
    }
}
