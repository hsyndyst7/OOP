package oop8;

public class Test {
	public static void main(String[] args) {
        Electronic e1 = new Electronic("Laptop", 15000, 2);
        Clothing c1 = new Clothing("T-Shirt", 300, "M");

        e1.applyDiscount(10);
        c1.changeSize("L");

        System.out.println("Store Products:\n");
        e1.displayInfo();
        c1.displayInfo();
    }
}
