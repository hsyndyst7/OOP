package oop3;

public class Customer {
	private String name;
    private double balance;
    
    
    private static int totalCustomers = 0;


    public Customer() {
        this.name = "Guest";
        this.balance = 1000.0;
        totalCustomers++; 
    }

  
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        totalCustomers++;
    }

    
    public void makePurchase(double amount, int qty) {
        System.out.println("\n--- Processing Transaction for " + this.name + " ---");
        
        
        if (qty > 10) { 
            System.out.println("Error: Quantity limit (10) exceeded.");
        } else if (this.balance < amount) {
            System.out.println("Error: Insufficient funds. Required: " + amount + " | Available: " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Purchase successful! New Balance: " + this.balance);
        }
    }

    public void deposit(double amount) {
        double bonusThreshold = 1000.0; 
        this.balance += amount;
        
        if (amount > bonusThreshold) {
            this.balance += 50.0; 
            System.out.println("Deposit of " + amount + " successful. 50 Loyalty Bonus applied!");
        } else {
            System.out.println("Deposit of " + amount + " successful.");
        }
    }

    public void updateProfile(String name) {
        this.name = name; 
    }

    public void checkCreditEligibility() {
      
        if (this.balance > 2000) {
            System.out.println(this.name + ": Eligible for Credit.");
        } else {
            System.out.println(this.name + ": Not Eligible.");
        }
    }

   
    public static int getTotalCustomers() {
        return totalCustomers;
    }

  
    public String getName() {
    	return name; }
    
    public void setName(String name) { this.name = name; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}

