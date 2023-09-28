package org.example;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Julio", Size.LARGE, new Clothing[]{
                new Clothing("Nice sweater", 29.99, Size.MEDIUM),
                new Clothing("Nice Jacket", 59.99, Size.SMALL),
                new Clothing("Nice Shirt", 29.99, Size.LARGE),
        });

        manager1.printEmployeePriceAfterDiscount(manager1.getClothingItems()[0]);
        manager1.printCustomerName(manager1);

        HourlyEmployee hourly1 = new HourlyEmployee("Hourly Julio", Size.LARGE, new Clothing[]{
                new Clothing("Nice sweater", 29.99, Size.MEDIUM),
                new Clothing("Nice Jacket", 59.99, Size.SMALL),
                new Clothing("Nice Shirt", 29.99, Size.LARGE),
        });

        hourly1.printEmployeePriceAfterDiscount(hourly1.getClothingItems()[0]);

//        Shop shop1 = new Shop();

        System.out.println(Shop.calculateTotal(manager1.getClothingItems()));
  }
}