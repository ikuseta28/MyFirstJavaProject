package week1_oop;

public class Main {
        static void main(String[] args) {

            BankAccount account1 = new BankAccount();
            account1.accountNumber = 1;
            account1.balance = 500;

            BankAccount account2 = new BankAccount();
            account2.accountNumber = 2;
            account2.balance = 750;

            account1.deposit(540);
            account2.withdraw(250);
            account1.showBalance();
            account2.showBalance();
        }
    }

