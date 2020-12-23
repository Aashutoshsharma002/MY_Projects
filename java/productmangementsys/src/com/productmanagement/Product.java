package com.productmanagement;

import java.util.Scanner;

public class Product {

    Scanner sc=new Scanner(System.in);
    private String name;
    private int price;
    private int quantity;
    private String category;
    private int production;
    private boolean isDeleted=false;

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public void setDeleted(boolean isDeleted){
        this.isDeleted=isDeleted;
    }

    public boolean getDeleted(){
        return isDeleted;
    }

    public void createProduct(){
        System.out.println("Enter name, price, quantity, category, production respectiveley");
        name=sc.next();
        price=sc.nextInt();
        quantity=sc.nextInt();
        category=sc.next();
        production=sc.nextInt();
    }

    public void displayProduct(){

        System.out.println(name+" "+price+" "+quantity+" "+category+" "+production);
    }
}