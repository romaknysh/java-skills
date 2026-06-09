package exceptions;

// Task 3
// Create a simple bank account system
//
// Custom exceptions:
// - InsufficientFundsException  (when withdrawing more than balance)
// - NegativeAmountException     (when deposit/withdraw amount is negative)
// - AccountFrozenException      (when account is frozen and any operation is attempted)
//
// Class BankAccount:
// - fields: balance (double), frozen (boolean), owner (String)
// - constructor: takes owner name and starting balance
// - method deposit(double amount)  - adds money, validates amount
// - method withdraw(double amount) - removes money, validates amount and balance
// - method freeze()                - freezes the account
// - method getBalance()            - returns current balance
//
// In main, test all scenarios:
// - normal deposit and withdraw
// - withdraw more than balance
// - deposit negative amount
// - freeze account and try to deposit
public class Task3 {
    static class InsufficientFundsException extends RuntimeException {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    static class NegativeAmountException extends RuntimeException {
        public NegativeAmountException(String message) {
            super(message);
        }
    }

    static class AccountFrozenException extends RuntimeException {
        public AccountFrozenException(String message) {
            super(message);
        }
    }

    static class BankAccount {
        private double balance;
        private boolean frozen;
        private String owner;

        public BankAccount(double balance, String owner){
            this.balance = balance;
            this.owner = owner;
            this.frozen = false;
        }

        // adds money, validates amount
        public void deposit(double amount){
            try {
                if (!this.frozen){
                    if (amount > 0) {
                        this.balance += amount;
                    } else throw new NegativeAmountException("negative amount");
                } else throw new AccountFrozenException("account frozen");
            }catch (AccountFrozenException e){
                System.out.println(e.getMessage());
            } catch (NegativeAmountException e){
                System.out.println(e.getMessage());
            }
        }

        // removes money, validates amount and balance
        public void withdraw(double amount) {
            try {
                if (!this.frozen){
                    if (this.balance > amount) {
                        this.balance -= amount;
                    } else throw new InsufficientFundsException("cant do that");
                } else throw new AccountFrozenException("account frozen");
            } catch (InsufficientFundsException e){
                System.out.println(e.getMessage());
            } catch (AccountFrozenException e){
                System.out.println(e.getMessage());
            }
        }

        public void freeze(){
            this.frozen = true;
        }

        public double getBalance(){
            return this.balance;
        }
    }

    public static void main(String[] args){
        BankAccount account123 = new BankAccount(12345, "Roma");
        // normal deposit and withdraw
        account123.deposit(123);
        account123.withdraw(123);

        // withdraw more than balance
        account123.withdraw(1234567);

        // deposit negative amount
        account123.deposit(-1234);

        // freeze and try to deposit
        account123.freeze();
        account123.deposit(500);
    }
}