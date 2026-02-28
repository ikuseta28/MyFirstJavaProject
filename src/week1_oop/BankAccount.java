package week1_oop;

public class BankAccount {
    int accountNumber;
    double balance;

    void deposit(double amount){
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        }
        else{
            System.out.println("Insufficient funds!");
        }
    }
    void showBalance(){
        System.out.println("Account " + accountNumber + " has balance: " + balance);
    }
}
