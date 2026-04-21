package oop3;

public class Order {
	 private String orderId;
	    private String productName;
	    private double price;
	    private int quantity;
	    
	   
	    private final int MAX_QUANTITY = 10;

	   
	    public Order() {
	        this.orderId = "0";
	        this.productName = "N/A";
	        this.price = 0.0;
	        this.quantity = 0;
	    }

	    
	    public Order(String orderId, String productName, double price, int quantity) {
	        this.orderId = orderId;
	        this.productName = productName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	   
	    public double calculateTotal() {
	        double taxRate = 0.20; 
	        double subTotal = this.price * this.quantity;
	        return subTotal * (1 + taxRate);
	    }

	   
	    public String getOrderId() { return orderId; }
	    public void setOrderId(String orderId) { this.orderId = orderId; }

	    public String getProductName() { return productName; }
	    public void setProductName(String productName) { this.productName = productName; }

	    public double getPrice() { return price; }
	    public void setPrice(double price) { this.price = price; }

	    public int getQuantity() { return quantity; }
	    public void setQuantity(int quantity) { this.quantity = quantity; }

	  
	    public int getMaxQuantity() { return MAX_QUANTITY; }
	}

