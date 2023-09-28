package org.example;

public abstract class Employee extends Customer implements Discountable {

    private final double DISCOUNT = .10;

    public Employee(String name) {
        super(name);
        final double discount = this.DISCOUNT;
    }

    public Employee(String name, Size size, Clothing[] clothingItems){
        super(name, size, clothingItems);
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public double calculateDiscount(Clothing clothingItem) {
        return clothingItem.getPrice() - (clothingItem.getPrice() * DISCOUNT);
    }

    public abstract void printEmployeePriceAfterDiscount(Clothing clothingItem);
}
