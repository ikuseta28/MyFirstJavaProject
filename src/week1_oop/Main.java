package week1_oop;

public class Main {
        static void main(String[] args) {

            BankAccount account1 = new BankAccount(1, 500);
            BankAccount account2 = new BankAccount(2, 1550);
            BankAccount account3 = new BankAccount(3, 650);

            Customer customer = new Customer("Mark");
            customer.addAccount(account1);
            customer.addAccount(account2);
            customer.addAccount(account3);

            customer.showAccounts();

            System.out.println("\nDepositing 200 into account 1");
            customer.depositToAccount(1, 200);

            System.out.println("\nWithdrawing 550 from account 2");
            customer.withdrawFromAccount(2, 550);

            System.out.println("\nAll accounts after transactions: ");
            customer.showAccounts();





        }
    }

