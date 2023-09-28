package org.example;

public class Shop {


    public static double calculateTotal(Clothing[] clothing){
        double total = 0;

        for(Clothing clothingItem : clothing ){
            total += clothingItem.getPrice();
        }

        return total;
    }


}
