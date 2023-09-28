package org.example;

import java.util.Arrays;

public abstract class Customer extends Person {

    public Customer(String name, Clothing[] clothingItems, Size size){
        super(name, size, clothingItems);
    }

    public Customer(String name) {
        super(name);
    }

    public Customer(String name, Size size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    public static void printCustomerName(Customer customer){
        System.out.println("The customer's name is " + customer.getName());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + getName() + '\'' +
                ", size=" + getSize() +
                ", clothingItems=" + Arrays.toString(getClothingItems()) +
                '}';
    }
}
