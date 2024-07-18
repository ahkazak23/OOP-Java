package lab3;
import java.math.BigDecimal;
import java.util.Scanner;

class Account {
    private String ownerName;
    private BigDecimal balance;
    private final String password = "1234";

    public Account(String name, double balance) {
        this.ownerName = name;
        this.balance = BigDecimal.valueOf(balance); 
    }

    public void add() {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the amount that you want to add: ");
    double amount = input.nextDouble();

    if (amount <= 0.0) {
        System.out.println("Invalid amount. Amount must be greater than zero.");
    } else {
        balance = balance.add(BigDecimal.valueOf(amount));
        System.out.println("Amount that was added: " + amount);
        System.out.println("New balance: " + balance); 
    }
}


    public void withdraw() {
        Scanner input = new Scanner(System.in);
        int cnt = 3;

        while (cnt > 0) {
            System.out.print("Please enter your password to proceed: ");
            String enteredPassword = input.next();

            if (enteredPassword.equals(password)) {
                System.out.print("Please enter the amount that you want to withdraw: ");
                BigDecimal amount = BigDecimal.valueOf(input.nextDouble());

                if (balance.compareTo(amount) >= 0) {
                    balance = balance.subtract(amount); // Use BigDecimal for precise subtraction
                    System.out.println("Amount that was withdrawn: " + amount);
                    System.out.println("New balance: " + balance);
                } else {
                    System.out.println("Insufficient balance");
                }
                break;
            } else {
                cnt--;
                System.out.println("Incorrect password. " + cnt + " attempts remaining.");
            }
        }

        if (cnt == 0) {
            System.out.println("You have exceeded the maximum number of attempts. Account locked.");
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getOwnerName() {
        return ownerName;
    }
}

public class Lab3 {
    public static void main(String[] args) {
        Account acc1 = new Account("Ali", 78.4);
        Account acc2 = new Account("Fang", -78.4);
        
        acc1.withdraw();
        
        BigDecimal acc1Balance = acc1.getBalance();
        System.out.println("Account 1 Balance: " + acc1Balance);

        acc1.setOwnerName("AZAZA");
        String acc1Name = acc1.getOwnerName();
        System.out.println("Account 1 Owner Name: " + acc1Name);

        acc2.withdraw();
       
        BigDecimal acc2Balance = acc2.getBalance();
        System.out.println("Account 2 Balance: " + acc2Balance);

        acc2.setOwnerName("KATANA");
        String acc2Name = acc2.getOwnerName();
        System.out.println("Account 2 Owner Name: " + acc2Name);
        acc1.add();
        acc2.add();
    }
}
