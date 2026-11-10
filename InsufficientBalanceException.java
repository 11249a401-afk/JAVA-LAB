// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Transaction Failed: Insufficient balance! Available balance is: " + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: " + amount + ". Remaining balance: " + balance);
    }
}

public class ATMProgram {
    public static void main(String[] args) {
        ATM myAccount = new ATM(5000.0);

        try {
            System.out.println("Attempting to withdraw 2000...");
            myAccount.withdraw(2000.0);

            System.out.println("\nAttempting to withdraw 4000...");
            myAccount.withdraw(4000.0); // This will trigger the exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}