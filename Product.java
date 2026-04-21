package oop8;

public class Product {
	 protected String name;
	    private double price;

	    public Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void applyDiscount(double rate) {
	        price = price - (price * rate / 100);
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Price: " + price);
	    }
}
