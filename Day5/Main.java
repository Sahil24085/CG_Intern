class CoffeeWallet {
    // Data members
    String name;
    double balance;

    // Constructor
    CoffeeWallet(String name, double openingDeposit) {
        this.name = name;
        this.balance = openingDeposit;
    }

    // Method to add funds
    void addFunds(double amount) {
        balance += amount;
        System.out.println("Added ₹" + amount);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Method to make a purchase
    void purchase(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Purchase successful: ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds!");
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    // Method to display account overview
    void accountOverview() {
        System.out.println("\n--- Account Overview ---");
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        // Open account with ₹500
        CoffeeWallet wallet = new CoffeeWallet("Sahil", 500);

        wallet.accountOverview();

        // Add ₹200
        wallet.addFunds(200);

        // Buy snack for ₹150
        wallet.purchase(150);

        // Try to buy something for ₹800
        wallet.purchase(800);

        // Final account overview
        wallet.accountOverview();
    }
}


