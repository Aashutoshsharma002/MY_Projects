package com.productmanagement;

import java.util.Scanner;

public class Management {

    Product[] products=new Product[5];
    Scanner sc=new Scanner(System.in);
    int noofproducts=0;
    int count=0;
    Management(){
        for(int i=0;i<products.length;i++){
            products[i]=new Product();
        }
    }

    public void addProduct(){

        int choice;
        do{
            products[noofproducts].createProduct();
            noofproducts++;
            count++;
            System.out.println("do u want to add one more ? 1-yes / 0-no");
            choice=sc.nextInt();
        }
        while(choice==1);


    }

    public void delete(){
        System.out.println("Enter the name of product u want to delete");
        String name=sc.next();
        if(count!=0){
            for(int i=0;i<noofproducts;i++){

                if(products[i].getName().equals(name)){
                    products[i].setDeleted(true);
                }
            }
        }
        else{
            System.out.println("You have 0 products");
        }






    }


    public void displayProducts(){

        if(count!=0){
            for(int i=0;i<noofproducts;i++){
                if(products[i].getDeleted()==false){
                    products[i].displayProduct();
                }

            }
        }
        else{
            System.out.println("You have 0 products");
        }


    }

    public void sortAndDisplay(){
        Product tempProduct;
        if(count!=0){
//            sorting logic
            for(int i=0;i<noofproducts;i++){
                for(int j=i+1;j<noofproducts;j++){

                    if(products[i].getPrice()<products[j].getPrice()){
                        tempProduct=products[i];
                        products[i]=products[j];
                        products[j]=tempProduct;

                    }

                }
            }

            for(int i=0;i<noofproducts;i++){
                if(products[i].getDeleted()==false) {
                    products[i].displayProduct();
                }
            }
        }
        else{
            System.out.println("You have 0 products");
        }

    }




}
