package week1_oop;

public class BankAccount {
   private int accountNumber;
   private double balance;

   public BankAccount(int accountNumber, double balance){
       this.accountNumber = accountNumber;
       this.balance = balance;
   }
    public void deposit(double amount){
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public void withdraw(double amount){
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
    public int getAccountNumber(){
       return accountNumber;
    }

    public double getBalance(){
       return balance;
    }
}
