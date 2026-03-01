package week1_oop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
   private String name;
   private List<BankAccount> accounts;

   public Customer(String name){
       this.name = name;
       this. accounts = new ArrayList<>();
   }

   public void addAccount(BankAccount account){
       accounts.add(account);
   }

   public void showAccounts(){
       System.out.println("Accounts for " + name + ":");
       for (BankAccount account : accounts){
           System.out.println("Account #" + account.getAccountNumber() +
                              " Balance: " + account.getBalance());
       }
   }
   public void depositToAccount(int accountNumber, double amount){
       for(BankAccount account : accounts){
           if(account.getAccountNumber() == accountNumber){
               account.deposit(amount);
               return;
           }
       }
       System.out.println("Account not found!");
   }
   public void withdrawFromAccount(int accountNumber, double amount){
       for(BankAccount account : accounts){
           if(account.getAccountNumber() == accountNumber){
               account.withdraw(amount);
               return;
           }
       }
       System.out.println("Account not found!");
   }
}
