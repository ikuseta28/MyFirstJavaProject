package week1_oop;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
   private int accountNumber;
   private double balance;
   private List<String> transactionHistory;

   public BankAccount(int accountNumber, double initialBalance) {
       this.accountNumber = accountNumber;
       if (initialBalance < 0) {
           System.out.println("Initial balance cannot be negative. Setting to 0. ");
       } else {
           this.balance = initialBalance;
       }

       this.transactionHistory = new ArrayList<>();
       transactionHistory.add("Account created with balance: " + this.balance);
   }
    public void deposit(double amount){
       if(amount <= 0){
           System.out.println("Deposit amount must be positive.");
           return;
       }
        balance += amount;
        transactionHistory.add("Deposited " + amount);
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public void withdraw(double amount){
       if(amount <= 0){
           System.out.println("Withdrawal amount must be positive.");
           return;
       }
        if(amount <= balance){
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        }
        else{
            System.out.println("Insufficient funds!");
        }
    }
    public void showBalance(){
        System.out.println("Account " + accountNumber + " has balance: " + balance);
    }
    public void showTransactionHistory() {
        System.out.println("Transaction history for account " + accountNumber + ":");
        for (String transaction : transactionHistory){
        System.out.println(transaction);
     }
   }
    public int getAccountNumber(){
       return accountNumber;
    }

    public double getBalance(){
       return balance;
    }
}
