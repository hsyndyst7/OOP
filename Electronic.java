package oop8;

public class Electronic extends Product {
    private int warranty;

    public Electronic(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public void extendWarranty(int years) {
        warranty += years;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warranty + " years");
        System.out.println();
    }

}
