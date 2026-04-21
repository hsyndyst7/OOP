package oop3;

public class Test {
	 public static void main(String[] args) {
	        
	        
	        Customer c1 = new Customer(); 
	        Customer c2 = new Customer("Sarah", 4500.0);
	        System.out.println("Total Customers Registered: " + Customer.getTotalCustomers());

	       
	        c1.updateProfile("Your Name"); 
	        c1.deposit(2000.0); 
	        System.out.println(c1.getName() + " Final Balance: " + c1.getBalance());

	        
	        Order laptop = new Order("ORD-001", "Laptop", 800.0, 1);
	        double totalToPay = laptop.calculateTotal(); 
	        System.out.println("\nOrder: " + laptop.getProductName());
	        System.out.println("Total Amount (Tax Included): " + totalToPay);

	        
	        c2.makePurchase(totalToPay, laptop.getQuantity());

	        
	        c1.makePurchase(totalToPay, laptop.getQuantity());

	        
	        Order bulkCables = new Order("ORD-002", "USB Cables", 10.0, 15);
	        c1.makePurchase(bulkCables.calculateTotal(), bulkCables.getQuantity());

	        
	        System.out.println("\n--- System Reports ---");
	        c1.checkCreditEligibility();
	        c2.checkCreditEligibility();
	    }
	}

