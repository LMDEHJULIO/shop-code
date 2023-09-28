package org.example;

import java.util.Arrays;

public abstract class Person {
    private String name;

    private Size size;

    private Clothing[] clothingItems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }

    public void setClothingItems(Clothing[] clothingItems) {
        this.clothingItems = clothingItems;
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, Size size, Clothing[] clothingItems){
        this.name = name;
        this.clothingItems = clothingItems;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", clothingItems=" + Arrays.toString(clothingItems) +
                '}';
    }
}
