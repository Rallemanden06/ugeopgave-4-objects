// Opgave 3
import java.util.ArrayList;

public class BankAccount {
    String owner;
    double balance;
    ArrayList<Transaction> transactions;

    BankAccount(String owner, double startBalance){
        this.owner = owner;
        this.balance = startBalance;
        this.transactions = new ArrayList<>();

        transactions.add(new Transaction("deposit",startBalance));
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            transactions.add(new Transaction("deposit",amount));
            System.out.println("Deposit: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            transactions.add(new Transaction("withdraw", amount));
            System.out.println("Withdraw: " + amount);
        }
    }

    public void printTransactionList(){
        for (Transaction t : transactions)
        System.out.println(t);
    }

    public double getBalance() {
        return balance;
    }
}

