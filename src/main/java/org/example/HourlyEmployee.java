package org.example;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(String name, Size size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    @Override
    public void printEmployeePriceAfterDiscount(Clothing clothingItem) {
        System.out.println(calculateDiscount(clothingItem));
    }
}
