package org.example;

public class Student extends Person implements Discountable{
    private long studentID;
    private final double DISCOUNT = .5;

    public Student(String name, long studentID, Size size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
        this.studentID = studentID;
    }

//    public Student(String name, long studentID, Size size, Clothing[] clothingItems){
//        super(name, size, clothingItems);
//        this.studentID = studentID;
//    }


    @Override
    public double calculateDiscount(Clothing clothingItem) {
        return clothingItem.getPrice() - (clothingItem.getPrice() * DISCOUNT) ;
    }
}
