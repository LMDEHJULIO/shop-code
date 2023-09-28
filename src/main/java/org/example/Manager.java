package org.example;

public class Manager extends Employee {

    private final double MANAGER_DISCOUNT = 0.05;

    public Manager(String name){
        super(name);
    }

    public Manager(String name, Size size, Clothing[] clothingItems){
        super(name, size, clothingItems);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothing){
        // base discount plus manager discount
        // Price - price - (price * total discount)

        double totalDiscount = MANAGER_DISCOUNT + this.getDISCOUNT();

        System.out.println(clothing.getPrice() - (clothing.getPrice() * totalDiscount));
    }
}
