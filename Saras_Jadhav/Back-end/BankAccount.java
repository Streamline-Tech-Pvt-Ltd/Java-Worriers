package streamlinetech.com.program;

class BankAccount {

    private double balance;

    
    public void setdeposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    
    public void setwithdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

   
    public double setgetBalance() {
        return balance;
    }
}

public class BankAcc {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setdeposit(5000);
        account.setwithdraw(2000);

        System.out.println("Current Balance: " + account.setgetBalance());
    }
}
